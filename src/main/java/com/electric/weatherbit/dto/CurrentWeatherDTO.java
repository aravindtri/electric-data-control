package com.electric.weatherbit.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
@Entity
@Table(name="current_weather")
public class CurrentWeatherDTO {
	@Id
	@GeneratedValue
	private Integer pk;
	private int clouds;
	private double temperature;
	private double solarrad;
	private double elevangle;
	private double uv;
	private int visibilityKm;
	private double hAngle;
	private double directNSIrdnc;
	private double diffuseHSIrdnc;
	private int precipitation;
	private double rhumidity;
	private double pressure;
	private Date lastUpdatedTime;
	private Date entryTime;
	public int getClouds() {
		return clouds;
	}
	public void setClouds(int clouds) {
		this.clouds = clouds;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getSolarrad() {
		return solarrad;
	}
	public void setSolarrad(double solarrad) {
		this.solarrad = solarrad;
	}
	public double getElevangle() {
		return elevangle;
	}
	public void setElevangle(double elevangle) {
		this.elevangle = elevangle;
	}
	public double getUv() {
		return uv;
	}
	public void setUv(double uv) {
		this.uv = uv;
	}
	public int getVisibilityKm() {
		return visibilityKm;
	}
	public void setVisibilityKm(int visibilityKm) {
		this.visibilityKm = visibilityKm;
	}
	public double gethAngle() {
		return hAngle;
	}
	public void sethAngle(double hAngle) {
		this.hAngle = hAngle;
	}
	public double getDirectNSIrdnc() {
		return directNSIrdnc;
	}
	public void setDirectNSIrdnc(double directNSIrdnc) {
		this.directNSIrdnc = directNSIrdnc;
	}
	public double getDiffuseHSIrdnc() {
		return diffuseHSIrdnc;
	}
	public void setDiffuseHSIrdnc(double diffuseHSIrdnc) {
		this.diffuseHSIrdnc = diffuseHSIrdnc;
	}
	public int getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(int precipitation) {
		this.precipitation = precipitation;
	}
	public double getRhumidity() {
		return rhumidity;
	}
	public void setRhumidity(double rhumidity) {
		this.rhumidity = rhumidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
