package com.electric.solaredge.rest.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.electric.solaredge.dto.CurrentSolarStateDTO;
import com.electric.solaredge.rest.data.response.currentstate.CurrentState;
import com.electric.solaredge.rest.data.response.currentstate.Overview;
import com.electric.solaredge.rest.service.SolarEdgeService;

@Service
public class SolarEdgeServiceImpl implements SolarEdgeService {

	@Value("${solaredge.overview.uri}")
	private String solarOverviewEndpoint;
	
	@Value("${solaredge.site.id}")
	private String siteId;
	
	@Value("${solaredge.api.key}")
	private String apiKey;
	
	@Value("${solaredge.power.unit}")
	private String powerUnit;
	
	@Value("${solaredge.time.format}")
	private String timeFormat;
	
	@Value("${solaredge.device.timeZone}")
	private String timeZone;
	
	@Value("${solaredge.overview.timeOffset}")
	private int timeOffset;
	
	@Override
	public CurrentSolarStateDTO getCurrentState() {
		RestTemplate template = new RestTemplate();
		CurrentState currentState = template.getForObject(String.format(solarOverviewEndpoint, siteId,apiKey), CurrentState.class);
		CurrentSolarStateDTO currentStateDTO = createAndPopulate(currentState);
		return currentStateDTO;
	}

	private CurrentSolarStateDTO createAndPopulate(CurrentState currentState) {
		CurrentSolarStateDTO currentStateDTO = new CurrentSolarStateDTO();
		Overview overview=currentState.getOverview();
		currentStateDTO.setCurrentPower(overview.getCurrentPower().getPower());
		currentStateDTO.setDate(converToDate(overview.getLastUpdateTime()));
		currentStateDTO.setMeasuredBy(overview.getMeasuredBy());
		currentStateDTO.setSiteId(siteId);
		currentStateDTO.setUnit(powerUnit);
		currentStateDTO.setTotalPower(overview.getLifeTimeData().getEnergy());
		return currentStateDTO;
	}

	private Date converToDate(String lastUpdateTime) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeFormat);
	    simpleDateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		try {
			return fixTime(simpleDateFormat.parse(lastUpdateTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();
	}
	
	private Date fixTime(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR, timeOffset);
		return cal.getTime();
	}

}
