
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
    "gps_as_of",
    "heading",
    "latitude",
    "longitude",
    "native_latitude",
    "native_location_supported",
    "native_longitude",
    "native_type",
    "power",
    "shift_state",
    "speed",
    "timestamp"
})
public class DriveState {

    @JsonProperty("gps_as_of")
    private Double gpsAsOf;
    @JsonProperty("heading")
    private Double heading;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("native_latitude")
    private Double nativeLatitude;
    @JsonProperty("native_location_supported")
    private Double nativeLocationSupported;
    @JsonProperty("native_longitude")
    private Double nativeLongitude;
    @JsonProperty("native_type")
    private String nativeType;
    @JsonProperty("power")
    private Double power;
    @JsonProperty("shift_state")
    private Object shiftState;
    @JsonProperty("speed")
    private Object speed;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gps_as_of")
    public Double getGpsAsOf() {
        return gpsAsOf;
    }

    @JsonProperty("gps_as_of")
    public void setGpsAsOf(Double gpsAsOf) {
        this.gpsAsOf = gpsAsOf;
    }

    @JsonProperty("heading")
    public Double getHeading() {
        return heading;
    }

    @JsonProperty("heading")
    public void setHeading(Double heading) {
        this.heading = heading;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("native_latitude")
    public Double getNativeLatitude() {
        return nativeLatitude;
    }

    @JsonProperty("native_latitude")
    public void setNativeLatitude(Double nativeLatitude) {
        this.nativeLatitude = nativeLatitude;
    }

    @JsonProperty("native_location_supported")
    public Double getNativeLocationSupported() {
        return nativeLocationSupported;
    }

    @JsonProperty("native_location_supported")
    public void setNativeLocationSupported(Double nativeLocationSupported) {
        this.nativeLocationSupported = nativeLocationSupported;
    }

    @JsonProperty("native_longitude")
    public Double getNativeLongitude() {
        return nativeLongitude;
    }

    @JsonProperty("native_longitude")
    public void setNativeLongitude(Double nativeLongitude) {
        this.nativeLongitude = nativeLongitude;
    }

    @JsonProperty("native_type")
    public String getNativeType() {
        return nativeType;
    }

    @JsonProperty("native_type")
    public void setNativeType(String nativeType) {
        this.nativeType = nativeType;
    }

    @JsonProperty("power")
    public Double getPower() {
        return power;
    }

    @JsonProperty("power")
    public void setPower(Double power) {
        this.power = power;
    }

    @JsonProperty("shift_state")
    public Object getShiftState() {
        return shiftState;
    }

    @JsonProperty("shift_state")
    public void setShiftState(Object shiftState) {
        this.shiftState = shiftState;
    }

    @JsonProperty("speed")
    public Object getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Object speed) {
        this.speed = speed;
    }

    @JsonProperty("timestamp")
    public Double getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
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
