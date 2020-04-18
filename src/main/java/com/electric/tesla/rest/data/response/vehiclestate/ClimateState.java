
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
    "battery_heater",
    "battery_heater_no_power",
    "climate_keeper_mode",
    "defrost_mode",
    "driver_temp_setting",
    "fan_status",
    "inside_temp",
    "is_auto_conditioning_on",
    "is_climate_on",
    "is_front_defroster_on",
    "is_preconditioning",
    "is_rear_defroster_on",
    "left_temp_direction",
    "max_avail_temp",
    "min_avail_temp",
    "outside_temp",
    "passenger_temp_setting",
    "remote_heater_control_enabled",
    "right_temp_direction",
    "seat_heater_left",
    "seat_heater_right",
    "side_mirror_heaters",
    "timestamp",
    "wiper_blade_heater"
})
public class ClimateState {

    @JsonProperty("battery_heater")
    private Boolean batteryHeater;
    @JsonProperty("battery_heater_no_power")
    private Object batteryHeaterNoPower;
    @JsonProperty("climate_keeper_mode")
    private String climateKeeperMode;
    @JsonProperty("defrost_mode")
    private Double defrostMode;
    @JsonProperty("driver_temp_setting")
    private Double driverTempSetting;
    @JsonProperty("fan_status")
    private Double fanStatus;
    @JsonProperty("inside_temp")
    private Double insideTemp;
    @JsonProperty("is_auto_conditioning_on")
    private Boolean isAutoConditioningOn;
    @JsonProperty("is_climate_on")
    private Boolean isClimateOn;
    @JsonProperty("is_front_defroster_on")
    private Boolean isFrontDefrosterOn;
    @JsonProperty("is_preconditioning")
    private Boolean isPreconditioning;
    @JsonProperty("is_rear_defroster_on")
    private Boolean isRearDefrosterOn;
    @JsonProperty("left_temp_direction")
    private Double leftTempDirection;
    @JsonProperty("max_avail_temp")
    private Double maxAvailTemp;
    @JsonProperty("min_avail_temp")
    private Double minAvailTemp;
    @JsonProperty("outside_temp")
    private Double outsideTemp;
    @JsonProperty("passenger_temp_setting")
    private Double passengerTempSetting;
    @JsonProperty("remote_heater_control_enabled")
    private Boolean remoteHeaterControlEnabled;
    @JsonProperty("right_temp_direction")
    private Double rightTempDirection;
    @JsonProperty("seat_heater_left")
    private Double seatHeaterLeft;
    @JsonProperty("seat_heater_right")
    private Double seatHeaterRight;
    @JsonProperty("side_mirror_heaters")
    private Boolean sideMirrorHeaters;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("wiper_blade_heater")
    private Boolean wiperBladeHeater;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("battery_heater")
    public Boolean getBatteryHeater() {
        return batteryHeater;
    }

    @JsonProperty("battery_heater")
    public void setBatteryHeater(Boolean batteryHeater) {
        this.batteryHeater = batteryHeater;
    }

    @JsonProperty("battery_heater_no_power")
    public Object getBatteryHeaterNoPower() {
        return batteryHeaterNoPower;
    }

    @JsonProperty("battery_heater_no_power")
    public void setBatteryHeaterNoPower(Object batteryHeaterNoPower) {
        this.batteryHeaterNoPower = batteryHeaterNoPower;
    }

    @JsonProperty("climate_keeper_mode")
    public String getClimateKeeperMode() {
        return climateKeeperMode;
    }

    @JsonProperty("climate_keeper_mode")
    public void setClimateKeeperMode(String climateKeeperMode) {
        this.climateKeeperMode = climateKeeperMode;
    }

    @JsonProperty("defrost_mode")
    public Double getDefrostMode() {
        return defrostMode;
    }

    @JsonProperty("defrost_mode")
    public void setDefrostMode(Double defrostMode) {
        this.defrostMode = defrostMode;
    }

    @JsonProperty("driver_temp_setting")
    public Double getDriverTempSetting() {
        return driverTempSetting;
    }

    @JsonProperty("driver_temp_setting")
    public void setDriverTempSetting(Double driverTempSetting) {
        this.driverTempSetting = driverTempSetting;
    }

    @JsonProperty("fan_status")
    public Double getFanStatus() {
        return fanStatus;
    }

    @JsonProperty("fan_status")
    public void setFanStatus(Double fanStatus) {
        this.fanStatus = fanStatus;
    }

    @JsonProperty("inside_temp")
    public Double getInsideTemp() {
        return insideTemp;
    }

    @JsonProperty("inside_temp")
    public void setInsideTemp(Double insideTemp) {
        this.insideTemp = insideTemp;
    }

    @JsonProperty("is_auto_conditioning_on")
    public Boolean getIsAutoConditioningOn() {
        return isAutoConditioningOn;
    }

    @JsonProperty("is_auto_conditioning_on")
    public void setIsAutoConditioningOn(Boolean isAutoConditioningOn) {
        this.isAutoConditioningOn = isAutoConditioningOn;
    }

    @JsonProperty("is_climate_on")
    public Boolean getIsClimateOn() {
        return isClimateOn;
    }

    @JsonProperty("is_climate_on")
    public void setIsClimateOn(Boolean isClimateOn) {
        this.isClimateOn = isClimateOn;
    }

    @JsonProperty("is_front_defroster_on")
    public Boolean getIsFrontDefrosterOn() {
        return isFrontDefrosterOn;
    }

    @JsonProperty("is_front_defroster_on")
    public void setIsFrontDefrosterOn(Boolean isFrontDefrosterOn) {
        this.isFrontDefrosterOn = isFrontDefrosterOn;
    }

    @JsonProperty("is_preconditioning")
    public Boolean getIsPreconditioning() {
        return isPreconditioning;
    }

    @JsonProperty("is_preconditioning")
    public void setIsPreconditioning(Boolean isPreconditioning) {
        this.isPreconditioning = isPreconditioning;
    }

    @JsonProperty("is_rear_defroster_on")
    public Boolean getIsRearDefrosterOn() {
        return isRearDefrosterOn;
    }

    @JsonProperty("is_rear_defroster_on")
    public void setIsRearDefrosterOn(Boolean isRearDefrosterOn) {
        this.isRearDefrosterOn = isRearDefrosterOn;
    }

    @JsonProperty("left_temp_direction")
    public Double getLeftTempDirection() {
        return leftTempDirection;
    }

    @JsonProperty("left_temp_direction")
    public void setLeftTempDirection(Double leftTempDirection) {
        this.leftTempDirection = leftTempDirection;
    }

    @JsonProperty("max_avail_temp")
    public Double getMaxAvailTemp() {
        return maxAvailTemp;
    }

    @JsonProperty("max_avail_temp")
    public void setMaxAvailTemp(Double maxAvailTemp) {
        this.maxAvailTemp = maxAvailTemp;
    }

    @JsonProperty("min_avail_temp")
    public Double getMinAvailTemp() {
        return minAvailTemp;
    }

    @JsonProperty("min_avail_temp")
    public void setMinAvailTemp(Double minAvailTemp) {
        this.minAvailTemp = minAvailTemp;
    }

    @JsonProperty("outside_temp")
    public Double getOutsideTemp() {
        return outsideTemp;
    }

    @JsonProperty("outside_temp")
    public void setOutsideTemp(Double outsideTemp) {
        this.outsideTemp = outsideTemp;
    }

    @JsonProperty("passenger_temp_setting")
    public Double getPassengerTempSetting() {
        return passengerTempSetting;
    }

    @JsonProperty("passenger_temp_setting")
    public void setPassengerTempSetting(Double passengerTempSetting) {
        this.passengerTempSetting = passengerTempSetting;
    }

    @JsonProperty("remote_heater_control_enabled")
    public Boolean getRemoteHeaterControlEnabled() {
        return remoteHeaterControlEnabled;
    }

    @JsonProperty("remote_heater_control_enabled")
    public void setRemoteHeaterControlEnabled(Boolean remoteHeaterControlEnabled) {
        this.remoteHeaterControlEnabled = remoteHeaterControlEnabled;
    }

    @JsonProperty("right_temp_direction")
    public Double getRightTempDirection() {
        return rightTempDirection;
    }

    @JsonProperty("right_temp_direction")
    public void setRightTempDirection(Double rightTempDirection) {
        this.rightTempDirection = rightTempDirection;
    }

    @JsonProperty("seat_heater_left")
    public Double getSeatHeaterLeft() {
        return seatHeaterLeft;
    }

    @JsonProperty("seat_heater_left")
    public void setSeatHeaterLeft(Double seatHeaterLeft) {
        this.seatHeaterLeft = seatHeaterLeft;
    }

    @JsonProperty("seat_heater_right")
    public Double getSeatHeaterRight() {
        return seatHeaterRight;
    }

    @JsonProperty("seat_heater_right")
    public void setSeatHeaterRight(Double seatHeaterRight) {
        this.seatHeaterRight = seatHeaterRight;
    }

    @JsonProperty("side_mirror_heaters")
    public Boolean getSideMirrorHeaters() {
        return sideMirrorHeaters;
    }

    @JsonProperty("side_mirror_heaters")
    public void setSideMirrorHeaters(Boolean sideMirrorHeaters) {
        this.sideMirrorHeaters = sideMirrorHeaters;
    }

    @JsonProperty("timestamp")
    public Double getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("wiper_blade_heater")
    public Boolean getWiperBladeHeater() {
        return wiperBladeHeater;
    }

    @JsonProperty("wiper_blade_heater")
    public void setWiperBladeHeater(Boolean wiperBladeHeater) {
        this.wiperBladeHeater = wiperBladeHeater;
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
