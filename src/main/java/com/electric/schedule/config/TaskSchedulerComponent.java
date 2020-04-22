package com.electric.schedule.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.electric.solaredge.dao.repo.CurrentSolarStateRepository;
import com.electric.solaredge.dto.CurrentSolarStateDTO;
import com.electric.solaredge.rest.service.SolarEdgeService;
import com.electric.tesla.dto.CurrentVehicleStateDTO;
import com.electric.tesla.rest.dao.repo.VehicleDataRepository;
import com.electric.tesla.rest.service.VehicleStateService;
import com.electric.weatherbit.dao.repo.CurrentWeatherRepository;
import com.electric.weatherbit.dto.CurrentWeatherDTO;
import com.electric.weatherbit.service.WeatherService;

@Component
public class TaskSchedulerComponent {

	private static final Logger LOG = LoggerFactory.getLogger(TaskSchedulerComponent.class);
	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	@Value("${solar.ev.charging}")
	private boolean charging;

	@Value("${charging.min.current}")
	private int minCurrent;

	@Value("${charging.power.buffer}")
	private int bufferPower;

	@Value("${charging.avg.volts}")
	private int voltage;

	@Value("${charging.control.file}")
	private String chargeControlConfig;

	@Resource
	private VehicleStateService vehicleStateService;

	@Resource
	private WeatherService weatherService;

	@Resource
	private SolarEdgeService solarEdgeService;

	@Resource
	private VehicleDataRepository vehicleDataRepository;

	@Resource
	private CurrentSolarStateRepository currentSolarStateRepository;

	@Resource
	private CurrentWeatherRepository currentWeatherRepository;

	// @Scheduled(cron = "0 0 3 * * *")
	// @Scheduled(fixedRate = 43200000)
	public void scheduleTaskTeslaMiles() {
		LOG.info("Tesla Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
		CurrentVehicleStateDTO vehicleDataDto = null;
		int i = 1;
		do {
			try {
				vehicleDataDto = vehicleStateService.getVehicleState();
				LOG.info("Vehicle Data - " + vehicleDataDto);
			} catch (Exception e) {
				LOG.error("Error getting response", e);
			}
			i++;
		} while (vehicleDataDto == null && i < 10);
		vehicleDataRepository.save(vehicleDataDto);
		LOG.info("Tesla Rows added - " + vehicleDataDto);
	}

	// @Scheduled(cron = "0 1,16,31,46 6-21 * * *")
	@Scheduled(fixedRate = 600000)
	public void scheduleTaskSolarOverview() {
		LOG.info("Solar Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
		CurrentSolarStateDTO currentStateDTO = null;
		int i = 1;
		do {
			try {
				currentStateDTO = solarEdgeService.getCurrentState();
				LOG.info("Solar Data - " + currentStateDTO);
			} catch (Exception e) {
				LOG.error("Error getting response", e);
			}
			i++;
		} while (currentStateDTO == null && i < 10);

		LOG.info("Solar bRows added - " + currentSolarStateRepository.save(currentStateDTO));
		if (charging) {
			updateChargeCurrent(currentStateDTO);
		}
	}

	private void updateChargeCurrent(CurrentSolarStateDTO currentStateDTO) {
		LOG.info("Solar power in watts " + currentStateDTO.getCurrentPower());
		double availablePower = currentStateDTO.getCurrentPower() - bufferPower;
		LOG.info("Available power in watts " + availablePower);
		int calCurrentValue = minCurrent;
		if (!(availablePower < 0 || availablePower < (voltage * minCurrent))) {
			calCurrentValue = (int) (availablePower / voltage);
		}
		LOG.info("Calculated current " + calCurrentValue);
		try {
			executeBashToSetCurrent(calCurrentValue);
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Scheduled(cron = "0 1,16,31,46 6-21 * * *")
	@Scheduled(fixedRate = 900000)
	public void scheduleTaskWeatherOverview() {
		CurrentWeatherDTO currentWeather = weatherService.getCurrentWeather();
		currentWeatherRepository.save(currentWeather);
	}

	private void executeBashToSetCurrent(int calCurrentValue) throws InterruptedException, IOException {

		String bash = String.format(FileUtils.readFileToString(new File(chargeControlConfig), StandardCharsets.UTF_8),
				calCurrentValue);
		LOG.info(bash);
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("bash", "-c", bash);

		try {

			Process process = processBuilder.start();
			StringBuilder output = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}
			int exitVal = process.waitFor();
			if (exitVal == 0) {
				LOG.info("Updated charge current to " + calCurrentValue);
			} else {
				LOG.error("Not Updated charge current to " + calCurrentValue);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}