package com.electric.weatherbit.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electric.weatherbit.dao.repo.CurrentWeatherRepository;
import com.electric.weatherbit.dto.CurrentWeatherDTO;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private CurrentWeatherRepository currentWeatherRepository;

	@GetMapping(value = "/latest")
	public CurrentWeatherDTO getLastestValue() {
		List<CurrentWeatherDTO> currentWeatherDTOs = currentWeatherRepository.findAllByOrderByEntryTimeDesc();
		if (ObjectUtils.isEmpty(currentWeatherDTOs)) {
			return new CurrentWeatherDTO();
		}
		return currentWeatherDTOs.get(0);
	}
}
