package com.electric.tesla.rest.service.impl;

import java.util.Collections;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.electric.tesla.dto.CurrentVehicleStateDTO;
import com.electric.tesla.rest.data.response.vehiclestate.ChargeState;
import com.electric.tesla.rest.data.response.vehiclestate.DriveState;
import com.electric.tesla.rest.data.response.vehiclestate.Response;
import com.electric.tesla.rest.data.response.vehiclestate.VehicleData;
import com.electric.tesla.rest.data.response.vehiclestate.VehicleState;
import com.electric.tesla.rest.service.VehicleStateService;
import com.electric.tesla.rest.service.auth.TeslaAuthService;
@Service
public class VehicleStateServiceImpl implements VehicleStateService {

	@Autowired
	private TeslaAuthService teslaAuthService;
	
	@Value("${tesla.vehicle.data.uri}")
	private String vehicleDataEndpoint;
	
	@Value("${tesla.vehicle.wakeup.uri}")
	private String vehicleWakeEndpoint;
	
	@Override
	public CurrentVehicleStateDTO getVehicleState() {
		try {
			if(wakeUpVehicle())
			{
				Thread.sleep(5000);
			}
			RestTemplate template = new RestTemplate();
			ResponseEntity<VehicleData> response=template.exchange(vehicleDataEndpoint, HttpMethod.GET, createEntityWithHeaders(),VehicleData.class);
			System.out.println(response.getBody());
			CurrentVehicleStateDTO vehicleDataDTO = createAndPopulate(response.getBody());
			revokeToken();
			return vehicleDataDTO;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			revokeToken();
			return null;
		}
	}
	
	private CurrentVehicleStateDTO createAndPopulate(VehicleData vehicleData)
	{
		CurrentVehicleStateDTO vehicleDataDTO = new CurrentVehicleStateDTO();
		Response response=vehicleData.getResponse();
		ChargeState chargeState=response.getChargeState();
		vehicleDataDTO.setBatteryLevel(chargeState.getBatteryLevel());
		vehicleDataDTO.setBatteryRange(chargeState.getBatteryRange());
		VehicleState vehicleState=response.getVehicleState();
		vehicleDataDTO.setDate(new Date(vehicleState.getTimestamp()));
		vehicleDataDTO.setEstBatteryRange(chargeState.getEstBatteryRange());
		DriveState driveState=response.getDriveState();
		vehicleDataDTO.setHeading(driveState.getHeading());
		vehicleDataDTO.setIdealBatteryRange(chargeState.getIdealBatteryRange());
		vehicleDataDTO.setInsideTemp(response.getClimateState().getInsideTemp());
		vehicleDataDTO.setLatitude(driveState.getLatitude());
		vehicleDataDTO.setLongitude(driveState.getLongitude());
		vehicleDataDTO.setMiles(vehicleState.getOdometer());
		vehicleDataDTO.setVehicleId(response.getVehicleId());
		vehicleDataDTO.setVin(response.getVin());
		return vehicleDataDTO;
	}
	
	@Override
	public boolean wakeUpVehicle() {
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response=template.exchange(vehicleWakeEndpoint, HttpMethod.POST, createEntityWithHeaders(),String.class);
		revokeToken();
		return response.getStatusCode().is2xxSuccessful();
	}

	private void revokeToken() {
		teslaAuthService.revokeToken();
	}

	private HttpEntity<String> createEntityWithHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", "Bearer "+getToken());
		HttpEntity<String> entity=new HttpEntity<String>("body",headers);
		return entity;
	}

	private String getToken() {
		return teslaAuthService.getAuthToken();
	}

}
