
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
    "can_accept_navigation_requests",
    "can_actuate_trunks",
    "car_special_type",
    "car_type",
    "charge_port_type",
    "ece_restrictions",
    "eu_vehicle",
    "exterior_color",
    "has_air_suspension",
    "has_ludicrous_mode",
    "key_version",
    "motorized_charge_port",
    "plg",
    "rear_seat_heaters",
    "rear_seat_type",
    "rhd",
    "roof_color",
    "seat_type",
    "spoiler_type",
    "sun_roof_installed",
    "third_row_seats",
    "timestamp",
    "use_range_badging",
    "wheel_type"
})
public class VehicleConfig {

    @JsonProperty("can_accept_navigation_requests")
    private Boolean canAcceptNavigationRequests;
    @JsonProperty("can_actuate_trunks")
    private Boolean canActuateTrunks;
    @JsonProperty("car_special_type")
    private String carSpecialType;
    @JsonProperty("car_type")
    private String carType;
    @JsonProperty("charge_port_type")
    private String chargePortType;
    @JsonProperty("ece_restrictions")
    private Boolean eceRestrictions;
    @JsonProperty("eu_vehicle")
    private Boolean euVehicle;
    @JsonProperty("exterior_color")
    private String exteriorColor;
    @JsonProperty("has_air_suspension")
    private Boolean hasAirSuspension;
    @JsonProperty("has_ludicrous_mode")
    private Boolean hasLudicrousMode;
    @JsonProperty("key_version")
    private Double keyVersion;
    @JsonProperty("motorized_charge_port")
    private Boolean motorizedChargePort;
    @JsonProperty("plg")
    private Boolean plg;
    @JsonProperty("rear_seat_heaters")
    private Double rearSeatHeaters;
    @JsonProperty("rear_seat_type")
    private Object rearSeatType;
    @JsonProperty("rhd")
    private Boolean rhd;
    @JsonProperty("roof_color")
    private String roofColor;
    @JsonProperty("seat_type")
    private Object seatType;
    @JsonProperty("spoiler_type")
    private String spoilerType;
    @JsonProperty("sun_roof_installed")
    private Object sunRoofInstalled;
    @JsonProperty("third_row_seats")
    private String thirdRowSeats;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonProperty("use_range_badging")
    private Boolean useRangeBadging;
    @JsonProperty("wheel_type")
    private String wheelType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("can_accept_navigation_requests")
    public Boolean getCanAcceptNavigationRequests() {
        return canAcceptNavigationRequests;
    }

    @JsonProperty("can_accept_navigation_requests")
    public void setCanAcceptNavigationRequests(Boolean canAcceptNavigationRequests) {
        this.canAcceptNavigationRequests = canAcceptNavigationRequests;
    }

    @JsonProperty("can_actuate_trunks")
    public Boolean getCanActuateTrunks() {
        return canActuateTrunks;
    }

    @JsonProperty("can_actuate_trunks")
    public void setCanActuateTrunks(Boolean canActuateTrunks) {
        this.canActuateTrunks = canActuateTrunks;
    }

    @JsonProperty("car_special_type")
    public String getCarSpecialType() {
        return carSpecialType;
    }

    @JsonProperty("car_special_type")
    public void setCarSpecialType(String carSpecialType) {
        this.carSpecialType = carSpecialType;
    }

    @JsonProperty("car_type")
    public String getCarType() {
        return carType;
    }

    @JsonProperty("car_type")
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @JsonProperty("charge_port_type")
    public String getChargePortType() {
        return chargePortType;
    }

    @JsonProperty("charge_port_type")
    public void setChargePortType(String chargePortType) {
        this.chargePortType = chargePortType;
    }

    @JsonProperty("ece_restrictions")
    public Boolean getEceRestrictions() {
        return eceRestrictions;
    }

    @JsonProperty("ece_restrictions")
    public void setEceRestrictions(Boolean eceRestrictions) {
        this.eceRestrictions = eceRestrictions;
    }

    @JsonProperty("eu_vehicle")
    public Boolean getEuVehicle() {
        return euVehicle;
    }

    @JsonProperty("eu_vehicle")
    public void setEuVehicle(Boolean euVehicle) {
        this.euVehicle = euVehicle;
    }

    @JsonProperty("exterior_color")
    public String getExteriorColor() {
        return exteriorColor;
    }

    @JsonProperty("exterior_color")
    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    @JsonProperty("has_air_suspension")
    public Boolean getHasAirSuspension() {
        return hasAirSuspension;
    }

    @JsonProperty("has_air_suspension")
    public void setHasAirSuspension(Boolean hasAirSuspension) {
        this.hasAirSuspension = hasAirSuspension;
    }

    @JsonProperty("has_ludicrous_mode")
    public Boolean getHasLudicrousMode() {
        return hasLudicrousMode;
    }

    @JsonProperty("has_ludicrous_mode")
    public void setHasLudicrousMode(Boolean hasLudicrousMode) {
        this.hasLudicrousMode = hasLudicrousMode;
    }

    @JsonProperty("key_version")
    public Double getKeyVersion() {
        return keyVersion;
    }

    @JsonProperty("key_version")
    public void setKeyVersion(Double keyVersion) {
        this.keyVersion = keyVersion;
    }

    @JsonProperty("motorized_charge_port")
    public Boolean getMotorizedChargePort() {
        return motorizedChargePort;
    }

    @JsonProperty("motorized_charge_port")
    public void setMotorizedChargePort(Boolean motorizedChargePort) {
        this.motorizedChargePort = motorizedChargePort;
    }

    @JsonProperty("plg")
    public Boolean getPlg() {
        return plg;
    }

    @JsonProperty("plg")
    public void setPlg(Boolean plg) {
        this.plg = plg;
    }

    @JsonProperty("rear_seat_heaters")
    public Double getRearSeatHeaters() {
        return rearSeatHeaters;
    }

    @JsonProperty("rear_seat_heaters")
    public void setRearSeatHeaters(Double rearSeatHeaters) {
        this.rearSeatHeaters = rearSeatHeaters;
    }

    @JsonProperty("rear_seat_type")
    public Object getRearSeatType() {
        return rearSeatType;
    }

    @JsonProperty("rear_seat_type")
    public void setRearSeatType(Object rearSeatType) {
        this.rearSeatType = rearSeatType;
    }

    @JsonProperty("rhd")
    public Boolean getRhd() {
        return rhd;
    }

    @JsonProperty("rhd")
    public void setRhd(Boolean rhd) {
        this.rhd = rhd;
    }

    @JsonProperty("roof_color")
    public String getRoofColor() {
        return roofColor;
    }

    @JsonProperty("roof_color")
    public void setRoofColor(String roofColor) {
        this.roofColor = roofColor;
    }

    @JsonProperty("seat_type")
    public Object getSeatType() {
        return seatType;
    }

    @JsonProperty("seat_type")
    public void setSeatType(Object seatType) {
        this.seatType = seatType;
    }

    @JsonProperty("spoiler_type")
    public String getSpoilerType() {
        return spoilerType;
    }

    @JsonProperty("spoiler_type")
    public void setSpoilerType(String spoilerType) {
        this.spoilerType = spoilerType;
    }

    @JsonProperty("sun_roof_installed")
    public Object getSunRoofInstalled() {
        return sunRoofInstalled;
    }

    @JsonProperty("sun_roof_installed")
    public void setSunRoofInstalled(Object sunRoofInstalled) {
        this.sunRoofInstalled = sunRoofInstalled;
    }

    @JsonProperty("third_row_seats")
    public String getThirdRowSeats() {
        return thirdRowSeats;
    }

    @JsonProperty("third_row_seats")
    public void setThirdRowSeats(String thirdRowSeats) {
        this.thirdRowSeats = thirdRowSeats;
    }

    @JsonProperty("timestamp")
    public Double getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("use_range_badging")
    public Boolean getUseRangeBadging() {
        return useRangeBadging;
    }

    @JsonProperty("use_range_badging")
    public void setUseRangeBadging(Boolean useRangeBadging) {
        this.useRangeBadging = useRangeBadging;
    }

    @JsonProperty("wheel_type")
    public String getWheelType() {
        return wheelType;
    }

    @JsonProperty("wheel_type")
    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
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
