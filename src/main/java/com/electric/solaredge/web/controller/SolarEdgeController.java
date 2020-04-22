package com.electric.solaredge.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electric.solaredge.dao.repo.CurrentSolarStateRepository;
import com.electric.solaredge.dto.CurrentSolarStateDTO;

@RestController
@RequestMapping("/solar")
public class SolarEdgeController {
	
	@Autowired
	private CurrentSolarStateRepository currentSolarStateRepository;
	@GetMapping(value="/latest")
	public CurrentSolarStateDTO getLastestValue()
	{
		List<CurrentSolarStateDTO> currentSolarStateDTOs = currentSolarStateRepository.findAllByOrderByDateDesc();
		if(ObjectUtils.isEmpty(currentSolarStateDTOs))
		{
			return new CurrentSolarStateDTO();
		}
		return currentSolarStateDTOs.get(0);
	}

}
