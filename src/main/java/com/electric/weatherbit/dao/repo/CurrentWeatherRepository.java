package com.electric.weatherbit.dao.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.electric.weatherbit.dto.CurrentWeatherDTO;

@Service
public interface CurrentWeatherRepository extends JpaRepository<CurrentWeatherDTO, Integer> {
	List<CurrentWeatherDTO> findAllByOrderByEntryTimeDesc();
}
