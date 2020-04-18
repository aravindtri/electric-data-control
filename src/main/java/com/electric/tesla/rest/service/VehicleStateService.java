package com.electric.tesla.rest.service;

import com.electric.tesla.dto.VehicleDataDTO;

public interface VehicleStateService {
	VehicleDataDTO getVehicleState();
	boolean wakeUpVehicle();
}
