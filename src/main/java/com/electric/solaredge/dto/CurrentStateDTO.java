package com.electric.solaredge.dto;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CurrentStateDTO {
	private double currentPower, totalPower;
	private Date date;
	private String unit, measuredBy, siteId;
	
	public double getCurrentPower() {
		return currentPower;
	}
	public void setCurrentPower(double currentPower) {
		this.currentPower = currentPower;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getMeasuredBy() {
		return measuredBy;
	}
	public void setMeasuredBy(String measuredBy) {
		this.measuredBy = measuredBy;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public double getTotalPower() {
		return totalPower;
	}
	public void setTotalPower(double totalPower) {
		this.totalPower = totalPower;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
/**
 * CREATE TABLE SolarCurrentState (
  siteId VARCHAR(15),
  currentPower decimal(10,5) unsigned,
  totalPower decimal(20,5) unsigned,
  date timestamp,
  unit VARCHAR(10),
  measuredBy VARCHAR(15)
  )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */