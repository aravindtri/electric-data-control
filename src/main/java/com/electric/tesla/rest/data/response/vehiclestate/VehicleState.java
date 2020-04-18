
package com.electric.tesla.rest.data.response.vehiclestate;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "api_version",
    "autopark_state_v3",
    "autopark_style",
    "calendar_supported",
    "car_version",
    "center_display_state",
    "df",
    "dr",
    "fd_window",
    "fp_window",
    "ft",
    "is_user_present",
    "last_autopark_error",
    "locked",
    "media_state",
    "notifications_supported",
    "odometer",
    "parsed_calendar_supported",
    "pf",
    "pr",
    "rd_window",
    "remote_start",
    "remote_start_enabled",
    "remote_start_supported",
    "rp_window",
    "rt",
    "sentry_mode",
    "sentry_mode_available",
    "smart_summon_available",
    "software_update",
    "speed_limit_mode",
    "summon_standby_mode_enabled",
    "timestamp",
    "valet_mode",
    "valet_pin_needed",
    "vehicle_name"
})
public class VehicleState {

    @JsonProperty("api_version")
    private Double apiVersion;
    @JsonProperty("autopark_state_v3")
    private String autoparkStateV3;
    @JsonProperty("autopark_style")
    private String autoparkStyle;
    @JsonProperty("calendar_supported")
    private Boolean calendarSupported;
    @JsonProperty("car_version")
    private String carVersion;
    @JsonProperty("center_display_state")
    private Double centerDisplayState;
    @JsonProperty("df")
    private Double df;
    @JsonProperty("dr")
    private Double dr;
    @JsonProperty("fd_window")
    private Double fdWindow;
    @JsonProperty("fp_window")
    private Double fpWindow;
    @JsonProperty("ft")
    private Double ft;
    @JsonProperty("is_user_present")
    private Boolean isUserPresent;
    @JsonProperty("last_autopark_error")
    private String lastAutoparkError;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("media_state")
    private MediaState mediaState;
    @JsonProperty("notifications_supported")
    private Boolean notificationsSupported;
    @JsonProperty("odometer")
    private Double odometer;
    @JsonProperty("parsed_calendar_supported")
    private Boolean parsedCalendarSupported;
    @JsonProperty("pf")
    private Double pf;
    @JsonProperty("pr")
    private Double pr;
    @JsonProperty("rd_window")
    private Double rdWindow;
    @JsonProperty("remote_start")
    private Boolean remoteStart;
    @JsonProperty("remote_start_enabled")
    private Boolean remoteStartEnabled;
    @JsonProperty("remote_start_supported")
    private Boolean remoteStartSupported;
    @JsonProperty("rp_window")
    private Double rpWindow;
    @JsonProperty("rt")
    private Double rt;
    @JsonProperty("sentry_mode")
    private Boolean sentryMode;
    @JsonProperty("sentry_mode_available")
    private Boolean sentryModeAvailable;
    @JsonProperty("smart_summon_available")
    private Boolean smartSummonAvailable;
    @JsonProperty("software_update")
    private SoftwareUpdate softwareUpdate;
    @JsonProperty("speed_limit_mode")
    private SpeedLimitMode speedLimitMode;
    @JsonProperty("summon_standby_mode_enabled")
    private Boolean summonStandbyModeEnabled;
    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonProperty("valet_mode")
    private Boolean valetMode;
    @JsonProperty("valet_pin_needed")
    private Boolean valetPinNeeded;
    @JsonProperty("vehicle_name")
    private String vehicleName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("api_version")
    public Double getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("api_version")
    public void setApiVersion(Double apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("autopark_state_v3")
    public String getAutoparkStateV3() {
        return autoparkStateV3;
    }

    @JsonProperty("autopark_state_v3")
    public void setAutoparkStateV3(String autoparkStateV3) {
        this.autoparkStateV3 = autoparkStateV3;
    }

    @JsonProperty("autopark_style")
    public String getAutoparkStyle() {
        return autoparkStyle;
    }

    @JsonProperty("autopark_style")
    public void setAutoparkStyle(String autoparkStyle) {
        this.autoparkStyle = autoparkStyle;
    }

    @JsonProperty("calendar_supported")
    public Boolean getCalendarSupported() {
        return calendarSupported;
    }

    @JsonProperty("calendar_supported")
    public void setCalendarSupported(Boolean calendarSupported) {
        this.calendarSupported = calendarSupported;
    }

    @JsonProperty("car_version")
    public String getCarVersion() {
        return carVersion;
    }

    @JsonProperty("car_version")
    public void setCarVersion(String carVersion) {
        this.carVersion = carVersion;
    }

    @JsonProperty("center_display_state")
    public Double getCenterDisplayState() {
        return centerDisplayState;
    }

    @JsonProperty("center_display_state")
    public void setCenterDisplayState(Double centerDisplayState) {
        this.centerDisplayState = centerDisplayState;
    }

    @JsonProperty("df")
    public Double getDf() {
        return df;
    }

    @JsonProperty("df")
    public void setDf(Double df) {
        this.df = df;
    }

    @JsonProperty("dr")
    public Double getDr() {
        return dr;
    }

    @JsonProperty("dr")
    public void setDr(Double dr) {
        this.dr = dr;
    }

    @JsonProperty("fd_window")
    public Double getFdWindow() {
        return fdWindow;
    }

    @JsonProperty("fd_window")
    public void setFdWindow(Double fdWindow) {
        this.fdWindow = fdWindow;
    }

    @JsonProperty("fp_window")
    public Double getFpWindow() {
        return fpWindow;
    }

    @JsonProperty("fp_window")
    public void setFpWindow(Double fpWindow) {
        this.fpWindow = fpWindow;
    }

    @JsonProperty("ft")
    public Double getFt() {
        return ft;
    }

    @JsonProperty("ft")
    public void setFt(Double ft) {
        this.ft = ft;
    }

    @JsonProperty("is_user_present")
    public Boolean getIsUserPresent() {
        return isUserPresent;
    }

    @JsonProperty("is_user_present")
    public void setIsUserPresent(Boolean isUserPresent) {
        this.isUserPresent = isUserPresent;
    }

    @JsonProperty("last_autopark_error")
    public String getLastAutoparkError() {
        return lastAutoparkError;
    }

    @JsonProperty("last_autopark_error")
    public void setLastAutoparkError(String lastAutoparkError) {
        this.lastAutoparkError = lastAutoparkError;
    }

    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonProperty("media_state")
    public MediaState getMediaState() {
        return mediaState;
    }

    @JsonProperty("media_state")
    public void setMediaState(MediaState mediaState) {
        this.mediaState = mediaState;
    }

    @JsonProperty("notifications_supported")
    public Boolean getNotificationsSupported() {
        return notificationsSupported;
    }

    @JsonProperty("notifications_supported")
    public void setNotificationsSupported(Boolean notificationsSupported) {
        this.notificationsSupported = notificationsSupported;
    }

    @JsonProperty("odometer")
    public Double getOdometer() {
        return odometer;
    }

    @JsonProperty("odometer")
    public void setOdometer(Double odometer) {
        this.odometer = odometer;
    }

    @JsonProperty("parsed_calendar_supported")
    public Boolean getParsedCalendarSupported() {
        return parsedCalendarSupported;
    }

    @JsonProperty("parsed_calendar_supported")
    public void setParsedCalendarSupported(Boolean parsedCalendarSupported) {
        this.parsedCalendarSupported = parsedCalendarSupported;
    }

    @JsonProperty("pf")
    public Double getPf() {
        return pf;
    }

    @JsonProperty("pf")
    public void setPf(Double pf) {
        this.pf = pf;
    }

    @JsonProperty("pr")
    public Double getPr() {
        return pr;
    }

    @JsonProperty("pr")
    public void setPr(Double pr) {
        this.pr = pr;
    }

    @JsonProperty("rd_window")
    public Double getRdWindow() {
        return rdWindow;
    }

    @JsonProperty("rd_window")
    public void setRdWindow(Double rdWindow) {
        this.rdWindow = rdWindow;
    }

    @JsonProperty("remote_start")
    public Boolean getRemoteStart() {
        return remoteStart;
    }

    @JsonProperty("remote_start")
    public void setRemoteStart(Boolean remoteStart) {
        this.remoteStart = remoteStart;
    }

    @JsonProperty("remote_start_enabled")
    public Boolean getRemoteStartEnabled() {
        return remoteStartEnabled;
    }

    @JsonProperty("remote_start_enabled")
    public void setRemoteStartEnabled(Boolean remoteStartEnabled) {
        this.remoteStartEnabled = remoteStartEnabled;
    }

    @JsonProperty("remote_start_supported")
    public Boolean getRemoteStartSupported() {
        return remoteStartSupported;
    }

    @JsonProperty("remote_start_supported")
    public void setRemoteStartSupported(Boolean remoteStartSupported) {
        this.remoteStartSupported = remoteStartSupported;
    }

    @JsonProperty("rp_window")
    public Double getRpWindow() {
        return rpWindow;
    }

    @JsonProperty("rp_window")
    public void setRpWindow(Double rpWindow) {
        this.rpWindow = rpWindow;
    }

    @JsonProperty("rt")
    public Double getRt() {
        return rt;
    }

    @JsonProperty("rt")
    public void setRt(Double rt) {
        this.rt = rt;
    }

    @JsonProperty("sentry_mode")
    public Boolean getSentryMode() {
        return sentryMode;
    }

    @JsonProperty("sentry_mode")
    public void setSentryMode(Boolean sentryMode) {
        this.sentryMode = sentryMode;
    }

    @JsonProperty("sentry_mode_available")
    public Boolean getSentryModeAvailable() {
        return sentryModeAvailable;
    }

    @JsonProperty("sentry_mode_available")
    public void setSentryModeAvailable(Boolean sentryModeAvailable) {
        this.sentryModeAvailable = sentryModeAvailable;
    }

    @JsonProperty("smart_summon_available")
    public Boolean getSmartSummonAvailable() {
        return smartSummonAvailable;
    }

    @JsonProperty("smart_summon_available")
    public void setSmartSummonAvailable(Boolean smartSummonAvailable) {
        this.smartSummonAvailable = smartSummonAvailable;
    }

    @JsonProperty("software_update")
    public SoftwareUpdate getSoftwareUpdate() {
        return softwareUpdate;
    }

    @JsonProperty("software_update")
    public void setSoftwareUpdate(SoftwareUpdate softwareUpdate) {
        this.softwareUpdate = softwareUpdate;
    }

    @JsonProperty("speed_limit_mode")
    public SpeedLimitMode getSpeedLimitMode() {
        return speedLimitMode;
    }

    @JsonProperty("speed_limit_mode")
    public void setSpeedLimitMode(SpeedLimitMode speedLimitMode) {
        this.speedLimitMode = speedLimitMode;
    }

    @JsonProperty("summon_standby_mode_enabled")
    public Boolean getSummonStandbyModeEnabled() {
        return summonStandbyModeEnabled;
    }

    @JsonProperty("summon_standby_mode_enabled")
    public void setSummonStandbyModeEnabled(Boolean summonStandbyModeEnabled) {
        this.summonStandbyModeEnabled = summonStandbyModeEnabled;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("valet_mode")
    public Boolean getValetMode() {
        return valetMode;
    }

    @JsonProperty("valet_mode")
    public void setValetMode(Boolean valetMode) {
        this.valetMode = valetMode;
    }

    @JsonProperty("valet_pin_needed")
    public Boolean getValetPinNeeded() {
        return valetPinNeeded;
    }

    @JsonProperty("valet_pin_needed")
    public void setValetPinNeeded(Boolean valetPinNeeded) {
        this.valetPinNeeded = valetPinNeeded;
    }

    @JsonProperty("vehicle_name")
    public String getVehicleName() {
        return vehicleName;
    }

    @JsonProperty("vehicle_name")
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @Override
   	public String toString() {
   		return ToStringBuilder.reflectionToString(this);
   	}

}
