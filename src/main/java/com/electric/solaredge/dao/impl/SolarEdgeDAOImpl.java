package com.electric.solaredge.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.electric.solaredge.dao.SolarEdgeDAO;
import com.electric.solaredge.dto.CurrentStateDTO;

@Service
public class SolarEdgeDAOImpl implements SolarEdgeDAO {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public int logSolarOverview(CurrentStateDTO currentStateDTO) {
		return jdbcTemplate.update(
                "insert into SolarCurrentState (siteId, currentPower, date, unit, measuredBy, totalPower)"
                + "values(?,?,?,?,?,?)",currentStateDTO.getSiteId(),currentStateDTO.getCurrentPower(),
                currentStateDTO.getDate(),currentStateDTO.getUnit(),currentStateDTO.getMeasuredBy(),currentStateDTO.getTotalPower());
	}

}
/**
 * CREATE TABLE SolarCurrentState (
  siteId VARCHAR(15),
  currentPower decimal(10,5) unsigned,
  date timestamp,
  unit VARCHAR(10),
  measuredBy VARCHAR(15)
  )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */