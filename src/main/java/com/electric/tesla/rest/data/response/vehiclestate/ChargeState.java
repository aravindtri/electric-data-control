
package com.electric.tesla.rest.data.response.vehiclestate;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "battery_heater_on",
    "battery_level",
    "battery_range",
    "charge_current_request",
    "charge_current_request_max",
    "charge_enable_request",
    "charge_energy_added",
    "charge_limit_soc",
    "charge_limit_soc_max",
    "charge_limit_soc_min",
    "charge_limit_soc_std",
    "charge_miles_added_ideal",
    "charge_miles_added_rated",
    "charge_port_cold_weather_mode",
    "charge_port_door_open",
    "charge_port_latch",
    "charge_rate",
    "charge_to_max_range",
    "charger_actual_current",
    "charger_phases",
    "charger_pilot_current",
    "charger_power",
    "charger_voltage",
    "charging_state",
    "conn_charge_cable",
    "est_battery_range",
    "fast_charger_brand",
    "fast_charger_present",
    "fast_charger_type",
    "ideal_battery_range",
    "managed_charging_active",
    "managed_charging_start_time",
    "managed_charging_user_canceled",
    "max_range_charge_counter",
    "minutes_to_full_charge",
    "not_enough_power_to_heat",
    "scheduled_charging_pending",
    "scheduled_charging_start_time",
    "time_to_full_charge",
    "timestamp",
    "trip_charging",
    "usable_battery_level",
    "user_charge_enable_request"
})
public class ChargeState {

    @JsonProperty("battery_heater_on")
    private Boolean batteryHeaterOn;
    @JsonProperty("battery_level")
    private Double batteryLevel;
    @JsonProperty("battery_range")
    private Double batteryRange;
    @JsonProperty("charge_current_request")
    private Double chargeCurrentRequest;
    @JsonProperty("charge_current_request_max")
    private Double chargeCurrentRequestMax;
    @JsonProperty("charge_enable_request")
    private Boolean chargeEnableRequest;
    @JsonProperty("charge_energy_added")
    private Double chargeEnergyAdded;
    @JsonProperty("charge_limit_soc")
    private Double chargeLimitSoc;
    @JsonProperty("charge_limit_soc_max")
    private Double chargeLimitSocMax;
    @JsonProperty("charge_limit_soc_min")
    private Double chargeLimitSocMin;
    @JsonProperty("charge_limit_soc_std")
    private Double chargeLimitSocStd;
    @JsonProperty("charge_miles_added_ideal")
    private Double chargeMilesAddedIdeal;
    @JsonProperty("charge_miles_added_rated")
    private Double chargeMilesAddedRated;
    @JsonProperty("charge_port_cold_weather_mode")
    private Boolean chargePortColdWeatherMode;
    @JsonProperty("charge_port_door_open")
    private Boolean chargePortDoorOpen;
    @JsonProperty("charge_port_latch")
    private String chargePortLatch;
    @JsonProperty("charge_rate")
    private Double chargeRate;
    @JsonProperty("charge_to_max_range")
    private Boolean chargeToMaxRange;
    @JsonProperty("charger_actual_current")
    private Double chargerActualCurrent;
    @JsonProperty("charger_phases")
    private Object chargerPhases;
    @JsonProperty("charger_pilot_current")
    private Double chargerPilotCurrent;
    @JsonProperty("charger_power")
    private Double chargerPower;
    @JsonProperty("charger_voltage")
    private Double chargerVoltage;
    @JsonProperty("charging_state")
    private String chargingState;
    @JsonProperty("conn_charge_cable")
    private String connChargeCable;
    @JsonProperty("est_battery_range")
    private Double estBatteryRange;
    @JsonProperty("fast_charger_brand")
    private String fastChargerBrand;
    @JsonProperty("fast_charger_present")
    private Boolean fastChargerPresent;
    @JsonProperty("fast_charger_type")
    private String fastChargerType;
    @JsonProperty("ideal_battery_range")
    private Double idealBatteryRange;
    @JsonProperty("managed_charging_active")
    private Boolean managedChargingActive;
    @JsonProperty("managed_charging_start_time")
    private Object managedChargingStartTime;
    @JsonProperty("managed_charging_user_canceled")
    private Boolean managedChargingUserCanceled;
    @JsonProperty("max_range_charge_counter")
    private Double maxRangeChargeCounter;
    @JsonProperty("minutes_to_full_charge")
    private Double minutesToFullCharge;
    @JsonProperty("not_enough_power_to_heat")
    private Object notEnoughPowerToHeat;
    @JsonProperty("scheduled_charging_pending")
    private Boolean scheduledChargingPending;
    @JsonProperty("scheduled_charging_start_time")
    private Object scheduledChargingStartTime;
    @JsonProperty("time_to_full_charge")
    private Double timeToFullCharge;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("trip_charging")
    private Boolean tripCharging;
    @JsonProperty("usable_battery_level")
    private Double usableBatteryLevel;
    @JsonProperty("user_charge_enable_request")
    private Object userChargeEnableRequest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("battery_heater_on")
    public Boolean getBatteryHeaterOn() {
        return batteryHeaterOn;
    }

    @JsonProperty("battery_heater_on")
    public void setBatteryHeaterOn(Boolean batteryHeaterOn) {
        this.batteryHeaterOn = batteryHeaterOn;
    }

    @JsonProperty("battery_level")
    public Double getBatteryLevel() {
        return batteryLevel;
    }

    @JsonProperty("battery_level")
    public void setBatteryLevel(Double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @JsonProperty("battery_range")
    public Double getBatteryRange() {
        return batteryRange;
    }

    @JsonProperty("battery_range")
    public void setBatteryRange(Double batteryRange) {
        this.batteryRange = batteryRange;
    }

    @JsonProperty("charge_current_request")
    public Double getChargeCurrentRequest() {
        return chargeCurrentRequest;
    }

    @JsonProperty("charge_current_request")
    public void setChargeCurrentRequest(Double chargeCurrentRequest) {
        this.chargeCurrentRequest = chargeCurrentRequest;
    }

    @JsonProperty("charge_current_request_max")
    public Double getChargeCurrentRequestMax() {
        return chargeCurrentRequestMax;
    }

    @JsonProperty("charge_current_request_max")
    public void setChargeCurrentRequestMax(Double chargeCurrentRequestMax) {
        this.chargeCurrentRequestMax = chargeCurrentRequestMax;
    }

    @JsonProperty("charge_enable_request")
    public Boolean getChargeEnableRequest() {
        return chargeEnableRequest;
    }

    @JsonProperty("charge_enable_request")
    public void setChargeEnableRequest(Boolean chargeEnableRequest) {
        this.chargeEnableRequest = chargeEnableRequest;
    }

    @JsonProperty("charge_energy_added")
    public Double getChargeEnergyAdded() {
        return chargeEnergyAdded;
    }

    @JsonProperty("charge_energy_added")
    public void setChargeEnergyAdded(Double chargeEnergyAdded) {
        this.chargeEnergyAdded = chargeEnergyAdded;
    }

    @JsonProperty("charge_limit_soc")
    public Double getChargeLimitSoc() {
        return chargeLimitSoc;
    }

    @JsonProperty("charge_limit_soc")
    public void setChargeLimitSoc(Double chargeLimitSoc) {
        this.chargeLimitSoc = chargeLimitSoc;
    }

    @JsonProperty("charge_limit_soc_max")
    public Double getChargeLimitSocMax() {
        return chargeLimitSocMax;
    }

    @JsonProperty("charge_limit_soc_max")
    public void setChargeLimitSocMax(Double chargeLimitSocMax) {
        this.chargeLimitSocMax = chargeLimitSocMax;
    }

    @JsonProperty("charge_limit_soc_min")
    public Double getChargeLimitSocMin() {
        return chargeLimitSocMin;
    }

    @JsonProperty("charge_limit_soc_min")
    public void setChargeLimitSocMin(Double chargeLimitSocMin) {
        this.chargeLimitSocMin = chargeLimitSocMin;
    }

    @JsonProperty("charge_limit_soc_std")
    public Double getChargeLimitSocStd() {
        return chargeLimitSocStd;
    }

    @JsonProperty("charge_limit_soc_std")
    public void setChargeLimitSocStd(Double chargeLimitSocStd) {
        this.chargeLimitSocStd = chargeLimitSocStd;
    }

    @JsonProperty("charge_miles_added_ideal")
    public Double getChargeMilesAddedIdeal() {
        return chargeMilesAddedIdeal;
    }

    @JsonProperty("charge_miles_added_ideal")
    public void setChargeMilesAddedIdeal(Double chargeMilesAddedIdeal) {
        this.chargeMilesAddedIdeal = chargeMilesAddedIdeal;
    }

    @JsonProperty("charge_miles_added_rated")
    public Double getChargeMilesAddedRated() {
        return chargeMilesAddedRated;
    }

    @JsonProperty("charge_miles_added_rated")
    public void setChargeMilesAddedRated(Double chargeMilesAddedRated) {
        this.chargeMilesAddedRated = chargeMilesAddedRated;
    }

    @JsonProperty("charge_port_cold_weather_mode")
    public Boolean getChargePortColdWeatherMode() {
        return chargePortColdWeatherMode;
    }

    @JsonProperty("charge_port_cold_weather_mode")
    public void setChargePortColdWeatherMode(Boolean chargePortColdWeatherMode) {
        this.chargePortColdWeatherMode = chargePortColdWeatherMode;
    }

    @JsonProperty("charge_port_door_open")
    public Boolean getChargePortDoorOpen() {
        return chargePortDoorOpen;
    }

    @JsonProperty("charge_port_door_open")
    public void setChargePortDoorOpen(Boolean chargePortDoorOpen) {
        this.chargePortDoorOpen = chargePortDoorOpen;
    }

    @JsonProperty("charge_port_latch")
    public String getChargePortLatch() {
        return chargePortLatch;
    }

    @JsonProperty("charge_port_latch")
    public void setChargePortLatch(String chargePortLatch) {
        this.chargePortLatch = chargePortLatch;
    }

    @JsonProperty("charge_rate")
    public Double getChargeRate() {
        return chargeRate;
    }

    @JsonProperty("charge_rate")
    public void setChargeRate(Double chargeRate) {
        this.chargeRate = chargeRate;
    }

    @JsonProperty("charge_to_max_range")
    public Boolean getChargeToMaxRange() {
        return chargeToMaxRange;
    }

    @JsonProperty("charge_to_max_range")
    public void setChargeToMaxRange(Boolean chargeToMaxRange) {
        this.chargeToMaxRange = chargeToMaxRange;
    }

    @JsonProperty("charger_actual_current")
    public Double getChargerActualCurrent() {
        return chargerActualCurrent;
    }

    @JsonProperty("charger_actual_current")
    public void setChargerActualCurrent(Double chargerActualCurrent) {
        this.chargerActualCurrent = chargerActualCurrent;
    }

    @JsonProperty("charger_phases")
    public Object getChargerPhases() {
        return chargerPhases;
    }

    @JsonProperty("charger_phases")
    public void setChargerPhases(Object chargerPhases) {
        this.chargerPhases = chargerPhases;
    }

    @JsonProperty("charger_pilot_current")
    public Double getChargerPilotCurrent() {
        return chargerPilotCurrent;
    }

    @JsonProperty("charger_pilot_current")
    public void setChargerPilotCurrent(Double chargerPilotCurrent) {
        this.chargerPilotCurrent = chargerPilotCurrent;
    }

    @JsonProperty("charger_power")
    public Double getChargerPower() {
        return chargerPower;
    }

    @JsonProperty("charger_power")
    public void setChargerPower(Double chargerPower) {
        this.chargerPower = chargerPower;
    }

    @JsonProperty("charger_voltage")
    public Double getChargerVoltage() {
        return chargerVoltage;
    }

    @JsonProperty("charger_voltage")
    public void setChargerVoltage(Double chargerVoltage) {
        this.chargerVoltage = chargerVoltage;
    }

    @JsonProperty("charging_state")
    public String getChargingState() {
        return chargingState;
    }

    @JsonProperty("charging_state")
    public void setChargingState(String chargingState) {
        this.chargingState = chargingState;
    }

    @JsonProperty("conn_charge_cable")
    public String getConnChargeCable() {
        return connChargeCable;
    }

    @JsonProperty("conn_charge_cable")
    public void setConnChargeCable(String connChargeCable) {
        this.connChargeCable = connChargeCable;
    }

    @JsonProperty("est_battery_range")
    public Double getEstBatteryRange() {
        return estBatteryRange;
    }

    @JsonProperty("est_battery_range")
    public void setEstBatteryRange(Double estBatteryRange) {
        this.estBatteryRange = estBatteryRange;
    }

    @JsonProperty("fast_charger_brand")
    public String getFastChargerBrand() {
        return fastChargerBrand;
    }

    @JsonProperty("fast_charger_brand")
    public void setFastChargerBrand(String fastChargerBrand) {
        this.fastChargerBrand = fastChargerBrand;
    }

    @JsonProperty("fast_charger_present")
    public Boolean getFastChargerPresent() {
        return fastChargerPresent;
    }

    @JsonProperty("fast_charger_present")
    public void setFastChargerPresent(Boolean fastChargerPresent) {
        this.fastChargerPresent = fastChargerPresent;
    }

    @JsonProperty("fast_charger_type")
    public String getFastChargerType() {
        return fastChargerType;
    }

    @JsonProperty("fast_charger_type")
    public void setFastChargerType(String fastChargerType) {
        this.fastChargerType = fastChargerType;
    }

    @JsonProperty("ideal_battery_range")
    public Double getIdealBatteryRange() {
        return idealBatteryRange;
    }

    @JsonProperty("ideal_battery_range")
    public void setIdealBatteryRange(Double idealBatteryRange) {
        this.idealBatteryRange = idealBatteryRange;
    }

    @JsonProperty("managed_charging_active")
    public Boolean getManagedChargingActive() {
        return managedChargingActive;
    }

    @JsonProperty("managed_charging_active")
    public void setManagedChargingActive(Boolean managedChargingActive) {
        this.managedChargingActive = managedChargingActive;
    }

    @JsonProperty("managed_charging_start_time")
    public Object getManagedChargingStartTime() {
        return managedChargingStartTime;
    }

    @JsonProperty("managed_charging_start_time")
    public void setManagedChargingStartTime(Object managedChargingStartTime) {
        this.managedChargingStartTime = managedChargingStartTime;
    }

    @JsonProperty("managed_charging_user_canceled")
    public Boolean getManagedChargingUserCanceled() {
        return managedChargingUserCanceled;
    }

    @JsonProperty("managed_charging_user_canceled")
    public void setManagedChargingUserCanceled(Boolean managedChargingUserCanceled) {
        this.managedChargingUserCanceled = managedChargingUserCanceled;
    }

    @JsonProperty("max_range_charge_counter")
    public Double getMaxRangeChargeCounter() {
        return maxRangeChargeCounter;
    }

    @JsonProperty("max_range_charge_counter")
    public void setMaxRangeChargeCounter(Double maxRangeChargeCounter) {
        this.maxRangeChargeCounter = maxRangeChargeCounter;
    }

    @JsonProperty("minutes_to_full_charge")
    public Double getMinutesToFullCharge() {
        return minutesToFullCharge;
    }

    @JsonProperty("minutes_to_full_charge")
    public void setMinutesToFullCharge(Double minutesToFullCharge) {
        this.minutesToFullCharge = minutesToFullCharge;
    }

    @JsonProperty("not_enough_power_to_heat")
    public Object getNotEnoughPowerToHeat() {
        return notEnoughPowerToHeat;
    }

    @JsonProperty("not_enough_power_to_heat")
    public void setNotEnoughPowerToHeat(Object notEnoughPowerToHeat) {
        this.notEnoughPowerToHeat = notEnoughPowerToHeat;
    }

    @JsonProperty("scheduled_charging_pending")
    public Boolean getScheduledChargingPending() {
        return scheduledChargingPending;
    }

    @JsonProperty("scheduled_charging_pending")
    public void setScheduledChargingPending(Boolean scheduledChargingPending) {
        this.scheduledChargingPending = scheduledChargingPending;
    }

    @JsonProperty("scheduled_charging_start_time")
    public Object getScheduledChargingStartTime() {
        return scheduledChargingStartTime;
    }

    @JsonProperty("scheduled_charging_start_time")
    public void setScheduledChargingStartTime(Object scheduledChargingStartTime) {
        this.scheduledChargingStartTime = scheduledChargingStartTime;
    }

    @JsonProperty("time_to_full_charge")
    public Double getTimeToFullCharge() {
        return timeToFullCharge;
    }

    @JsonProperty("time_to_full_charge")
    public void setTimeToFullCharge(Double timeToFullCharge) {
        this.timeToFullCharge = timeToFullCharge;
    }

    @JsonProperty("timestamp")
    public Double getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("trip_charging")
    public Boolean getTripCharging() {
        return tripCharging;
    }

    @JsonProperty("trip_charging")
    public void setTripCharging(Boolean tripCharging) {
        this.tripCharging = tripCharging;
    }

    @JsonProperty("usable_battery_level")
    public Double getUsableBatteryLevel() {
        return usableBatteryLevel;
    }

    @JsonProperty("usable_battery_level")
    public void setUsableBatteryLevel(Double usableBatteryLevel) {
        this.usableBatteryLevel = usableBatteryLevel;
    }

    @JsonProperty("user_charge_enable_request")
    public Object getUserChargeEnableRequest() {
        return userChargeEnableRequest;
    }

    @JsonProperty("user_charge_enable_request")
    public void setUserChargeEnableRequest(Object userChargeEnableRequest) {
        this.userChargeEnableRequest = userChargeEnableRequest;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
