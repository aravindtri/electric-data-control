package com.electric.solaredge.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
@Entity
@Table(name="current_solar_state")
public class CurrentSolarStateDTO {
	@Id
	@GeneratedValue
	private Integer pk;
	private double currentPower;
	private double totalPower;
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
	public Integer getPk() {
		return pk;
	}
	public void setPk(Integer pk) {
		this.pk = pk;
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