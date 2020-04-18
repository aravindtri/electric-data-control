
package com.electric.tesla.rest.data.response.vehiclestate;

import java.util.HashMap;
import java.util.List;
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
    "id",
    "user_id",
    "vehicle_id",
    "vin",
    "display_name",
    "option_codes",
    "color",
    "tokens",
    "state",
    "in_service",
    "id_s",
    "calendar_enabled",
    "api_version",
    "backseat_token",
    "backseat_token_updated_at",
    "charge_state",
    "climate_state",
    "drive_state",
    "gui_settings",
    "vehicle_config",
    "vehicle_state"
})
public class Response {

    @JsonProperty("id")
    private Double id;
    @JsonProperty("user_id")
    private Double userId;
    @JsonProperty("vehicle_id")
    private int vehicleId;
    @JsonProperty("vin")
    private String vin;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("option_codes")
    private String optionCodes;
    @JsonProperty("color")
    private Object color;
    @JsonProperty("tokens")
    private List<String> tokens = null;
    @JsonProperty("state")
    private String state;
    @JsonProperty("in_service")
    private Boolean inService;
    @JsonProperty("id_s")
    private String idS;
    @JsonProperty("calendar_enabled")
    private Boolean calendarEnabled;
    @JsonProperty("api_version")
    private Double apiVersion;
    @JsonProperty("backseat_token")
    private Object backseatToken;
    @JsonProperty("backseat_token_updated_at")
    private Object backseatTokenUpdatedAt;
    @JsonProperty("charge_state")
    private ChargeState chargeState;
    @JsonProperty("climate_state")
    private ClimateState climateState;
    @JsonProperty("drive_state")
    private DriveState driveState;
    @JsonProperty("gui_settings")
    private GuiSettings guiSettings;
    @JsonProperty("vehicle_config")
    private VehicleConfig vehicleConfig;
    @JsonProperty("vehicle_state")
    private VehicleState vehicleState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Double getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Double id) {
        this.id = id;
    }

    @JsonProperty("user_id")
    public Double getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Double userId) {
        this.userId = userId;
    }

    @JsonProperty("vehicle_id")
    public int getVehicleId() {
        return vehicleId;
    }

    @JsonProperty("vehicle_id")
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @JsonProperty("vin")
    public String getVin() {
        return vin;
    }

    @JsonProperty("vin")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("option_codes")
    public String getOptionCodes() {
        return optionCodes;
    }

    @JsonProperty("option_codes")
    public void setOptionCodes(String optionCodes) {
        this.optionCodes = optionCodes;
    }

    @JsonProperty("color")
    public Object getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Object color) {
        this.color = color;
    }

    @JsonProperty("tokens")
    public List<String> getTokens() {
        return tokens;
    }

    @JsonProperty("tokens")
    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("in_service")
    public Boolean getInService() {
        return inService;
    }

    @JsonProperty("in_service")
    public void setInService(Boolean inService) {
        this.inService = inService;
    }

    @JsonProperty("id_s")
    public String getIdS() {
        return idS;
    }

    @JsonProperty("id_s")
    public void setIdS(String idS) {
        this.idS = idS;
    }

    @JsonProperty("calendar_enabled")
    public Boolean getCalendarEnabled() {
        return calendarEnabled;
    }

    @JsonProperty("calendar_enabled")
    public void setCalendarEnabled(Boolean calendarEnabled) {
        this.calendarEnabled = calendarEnabled;
    }

    @JsonProperty("api_version")
    public Double getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("api_version")
    public void setApiVersion(Double apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("backseat_token")
    public Object getBackseatToken() {
        return backseatToken;
    }

    @JsonProperty("backseat_token")
    public void setBackseatToken(Object backseatToken) {
        this.backseatToken = backseatToken;
    }

    @JsonProperty("backseat_token_updated_at")
    public Object getBackseatTokenUpdatedAt() {
        return backseatTokenUpdatedAt;
    }

    @JsonProperty("backseat_token_updated_at")
    public void setBackseatTokenUpdatedAt(Object backseatTokenUpdatedAt) {
        this.backseatTokenUpdatedAt = backseatTokenUpdatedAt;
    }

    @JsonProperty("charge_state")
    public ChargeState getChargeState() {
        return chargeState;
    }

    @JsonProperty("charge_state")
    public void setChargeState(ChargeState chargeState) {
        this.chargeState = chargeState;
    }

    @JsonProperty("climate_state")
    public ClimateState getClimateState() {
        return climateState;
    }

    @JsonProperty("climate_state")
    public void setClimateState(ClimateState climateState) {
        this.climateState = climateState;
    }

    @JsonProperty("drive_state")
    public DriveState getDriveState() {
        return driveState;
    }

    @JsonProperty("drive_state")
    public void setDriveState(DriveState driveState) {
        this.driveState = driveState;
    }

    @JsonProperty("gui_settings")
    public GuiSettings getGuiSettings() {
        return guiSettings;
    }

    @JsonProperty("gui_settings")
    public void setGuiSettings(GuiSettings guiSettings) {
        this.guiSettings = guiSettings;
    }

    @JsonProperty("vehicle_config")
    public VehicleConfig getVehicleConfig() {
        return vehicleConfig;
    }

    @JsonProperty("vehicle_config")
    public void setVehicleConfig(VehicleConfig vehicleConfig) {
        this.vehicleConfig = vehicleConfig;
    }

    @JsonProperty("vehicle_state")
    public VehicleState getVehicleState() {
        return vehicleState;
    }

    @JsonProperty("vehicle_state")
    public void setVehicleState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
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
