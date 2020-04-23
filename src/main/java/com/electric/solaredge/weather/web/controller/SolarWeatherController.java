package com.electric.solaredge.weather.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electric.solaredge.weather.dao.repo.SolarWeatherRepository;
import com.electric.solaredge.weather.dto.SolarWeatherDTO;

@RestController
@RequestMapping("/solarweather")
public class SolarWeatherController {

	@Autowired
	private SolarWeatherRepository solarWeatherRepository;

	@GetMapping(value = "/all")
	public List<SolarWeatherDTO> getLastestValue() {
		return solarWeatherRepository.findAll();
	}
}
