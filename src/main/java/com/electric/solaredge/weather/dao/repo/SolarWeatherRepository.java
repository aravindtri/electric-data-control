package com.electric.solaredge.weather.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.electric.solaredge.weather.dto.SolarWeatherDTO;

@Service
public interface SolarWeatherRepository extends JpaRepository<SolarWeatherDTO, Integer> {

}
