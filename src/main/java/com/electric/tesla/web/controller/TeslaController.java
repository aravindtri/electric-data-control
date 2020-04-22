package com.electric.tesla.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electric.tesla.dto.CurrentVehicleStateDTO;
import com.electric.tesla.rest.dao.repo.VehicleDataRepository;

@RestController
@RequestMapping("/tesla")
public class TeslaController {
	
	@Autowired
	private VehicleDataRepository vehicleDataRepository;
	@GetMapping(value="/latest")
	public CurrentVehicleStateDTO getLastestValue()
	{
		List<CurrentVehicleStateDTO> currentVehicleStateDTOs=vehicleDataRepository.findAllByOrderByDateDesc();
		if(ObjectUtils.isEmpty(currentVehicleStateDTOs))
		{
			return new CurrentVehicleStateDTO();
		}
		return currentVehicleStateDTOs.get(0);
	}

}