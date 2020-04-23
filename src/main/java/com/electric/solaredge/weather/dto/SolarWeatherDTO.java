package com.electric.solaredge.weather.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.electric.solaredge.dto.CurrentSolarStateDTO;
import com.electric.weatherbit.dto.CurrentWeatherDTO;

@Entity
@Table(name = "current_solar_weather")
public class SolarWeatherDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pk;
	private double currentPower;
	private Date solarUpdatedTime, weatherUpdatedTime;
	private int clouds;
	private double temperatureInC;
	private double solarrad;
	private double elevangle;
	private double uv;
	private int visibilityKm;
	@OneToOne
	private CurrentWeatherDTO currentWeather;
	@OneToOne
	private CurrentSolarStateDTO currentSolarState;

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public double getCurrentPower() {
		return currentPower;
	}

	public void setCurrentPower(double currentPower) {
		this.currentPower = currentPower;
	}

	public Date getSolarUpdatedTime() {
		return solarUpdatedTime;
	}

	public void setSolarUpdatedTime(Date solarUpdatedTime) {
		this.solarUpdatedTime = solarUpdatedTime;
	}

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	public double getTemperatureInC() {
		return temperatureInC;
	}

	public void setTemperatureInC(double temperatureInC) {
		this.temperatureInC = temperatureInC;
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

	public CurrentWeatherDTO getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(CurrentWeatherDTO currentWeather) {
		this.currentWeather = currentWeather;
	}

	public CurrentSolarStateDTO getCurrentSolarState() {
		return currentSolarState;
	}

	public void setCurrentSolarState(CurrentSolarStateDTO currentSolarState) {
		this.currentSolarState = currentSolarState;
	}

	public Date getWeatherUpdatedTime() {
		return weatherUpdatedTime;
	}

	public void setWeatherUpdatedTime(Date weatherUpdatedTime) {
		this.weatherUpdatedTime = weatherUpdatedTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
