package com.electric.tesla.rest.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.electric.tesla.dto.VehicleDataDTO;
import com.electric.tesla.rest.dao.VehicleDataDAO;
@Service
public class VehicleDataDAOImpl implements VehicleDataDAO {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public int logVehicleData(VehicleDataDTO vehicleDataDto) {
		return jdbcTemplate.update(
                "insert into VehicleData (vin, vehicleId, miles, date, batteryLevel, batteryRange, estBatteryRange, idealBatteryRange, latitude, longitude, heading, insideTemp) values(?,?,?,?,?,?,?,?,?,?,?,?)",
                vehicleDataDto.getVin(), vehicleDataDto.getVehicleId(), vehicleDataDto.getMiles(), vehicleDataDto.getDate(), vehicleDataDto.getBatteryLevel(), vehicleDataDto.getBatteryRange()
                ,vehicleDataDto.getEstBatteryRange(), vehicleDataDto.getIdealBatteryRange(), vehicleDataDto.getLatitude(), vehicleDataDto.getLongitude(), vehicleDataDto.getHeading(), vehicleDataDto.getInsideTemp());
	}

}
