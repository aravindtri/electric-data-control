package com.electric.tesla.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "vehicle_data")
public class CurrentVehicleStateDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pk;
	private Date date;
	private int vehicleId;
	private String vin;
	private double batteryLevel, miles, batteryRange, latitude, longitude, insideTemp, estBatteryRange,
			idealBatteryRange, heading; // 133.28
	// 35.057878

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getBatteryRange() {
		return batteryRange;
	}

	public void setBatteryRange(double batteryRange) {
		this.batteryRange = batteryRange;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getInsideTemp() {
		return insideTemp;
	}

	public void setInsideTemp(double insideTemp) {
		this.insideTemp = insideTemp;
	}

	public double getEstBatteryRange() {
		return estBatteryRange;
	}

	public void setEstBatteryRange(double estBatteryRange) {
		this.estBatteryRange = estBatteryRange;
	}

	public double getIdealBatteryRange() {
		return idealBatteryRange;
	}

	public void setIdealBatteryRange(double idealBatteryRange) {
		this.idealBatteryRange = idealBatteryRange;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public double getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public double getHeading() {
		return heading;
	}

	public void setHeading(double heading) {
		this.heading = heading;
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
 * CREATE TABLE VehicleData ( vin VARCHAR(20), vehicleId INT, date timestamp,
 * miles decimal(14,7) unsigned, batteryLevel decimal(6,3) unsigned,
 * batteryRange decimal(7,3) unsigned, estBatteryRange decimal(7,3) unsigned,
 * idealBatteryRange decimal(7,3) unsigned, latitude decimal(11, 8), longitude
 * decimal(11, 8), heading decimal(11, 8), insideTemp decimal(5,2) )
 * ENGINE=InnoDB DEFAULT CHARSET=utf8;
 * 
 */
