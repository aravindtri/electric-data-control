package com.electric.tesla.rest.service;

import com.electric.tesla.dto.CurrentVehicleStateDTO;

public interface VehicleStateService {
	CurrentVehicleStateDTO getVehicleState();
	boolean wakeUpVehicle();
}
