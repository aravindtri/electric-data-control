package com.electric.weatherbit.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.electric.weatherbit.dto.CurrentWeatherDTO;
import com.electric.weatherbit.rest.data.response.currentweather.CurrentWeather;
import com.electric.weatherbit.rest.data.response.currentweather.Datum;
import com.electric.weatherbit.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Value("${weatherbit.current.uri}")
	private String weatherEndpoint;
	
	@Value("${weatherbit.api.key}")
	private String apiKey;
	
	@Value("${weatherbit.location.latitude}")
	private String latitude;
	
	@Value("${weatherbit.location.longitude}")
	private String longitude;
	
	@Value("${weatherbit.time.format}")
	private String timeFormat;
	
	@Value("${weatherbit.time.zone}")
	private String timeZone;
	
	@Override
	public CurrentWeatherDTO getCurrentWeather() {
		RestTemplate template = new RestTemplate();
		CurrentWeather weather=template.getForObject(String.format(weatherEndpoint, latitude, longitude, apiKey), CurrentWeather.class);
		return createAndPopulate(weather);
	}
	
	private CurrentWeatherDTO createAndPopulate(CurrentWeather currentWeather) {
		CurrentWeatherDTO currentWeatherDTO = new CurrentWeatherDTO();
		Datum data=currentWeather.getData().iterator().next();
		currentWeatherDTO.setClouds(data.getClouds());
		currentWeatherDTO.setDiffuseHSIrdnc(data.getDhi());
		currentWeatherDTO.setDirectNSIrdnc(data.getDni());
		currentWeatherDTO.setElevangle(data.getElevAngle());
		currentWeatherDTO.setEntryTime(new Date());
		currentWeatherDTO.sethAngle(data.getHAngle());
		currentWeatherDTO.setLastUpdatedTime(convertDate(data.getLastObTime()));
		currentWeatherDTO.setPrecipitation(data.getPres());
		currentWeatherDTO.setPressure(data.getPres());
		currentWeatherDTO.setRhumidity(data.getRh());
		currentWeatherDTO.setSolarrad(data.getSolarRad());
		currentWeatherDTO.setTemperature(data.getTemp());
		currentWeatherDTO.setUv(data.getUv());
		currentWeatherDTO.setVisibilityKm(data.getVis());
		return currentWeatherDTO;
	}

	private Date convertDate(String lastObTime) {
		try {
			return new SimpleDateFormat(timeFormat).parse(lastObTime+timeZone);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Date();
	}

}
