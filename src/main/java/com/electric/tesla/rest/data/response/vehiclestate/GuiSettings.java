
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
    "gui_24_hour_time",
    "gui_charge_rate_units",
    "gui_distance_units",
    "gui_range_display",
    "gui_temperature_units",
    "show_range_units",
    "timestamp"
})
public class GuiSettings {

    @JsonProperty("gui_24_hour_time")
    private Boolean gui24HourTime;
    @JsonProperty("gui_charge_rate_units")
    private String guiChargeRateUnits;
    @JsonProperty("gui_distance_units")
    private String guiDistanceUnits;
    @JsonProperty("gui_range_display")
    private String guiRangeDisplay;
    @JsonProperty("gui_temperature_units")
    private String guiTemperatureUnits;
    @JsonProperty("show_range_units")
    private Boolean showRangeUnits;
    @JsonProperty("timestamp")
    private Double timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gui_24_hour_time")
    public Boolean getGui24HourTime() {
        return gui24HourTime;
    }

    @JsonProperty("gui_24_hour_time")
    public void setGui24HourTime(Boolean gui24HourTime) {
        this.gui24HourTime = gui24HourTime;
    }

    @JsonProperty("gui_charge_rate_units")
    public String getGuiChargeRateUnits() {
        return guiChargeRateUnits;
    }

    @JsonProperty("gui_charge_rate_units")
    public void setGuiChargeRateUnits(String guiChargeRateUnits) {
        this.guiChargeRateUnits = guiChargeRateUnits;
    }

    @JsonProperty("gui_distance_units")
    public String getGuiDistanceUnits() {
        return guiDistanceUnits;
    }

    @JsonProperty("gui_distance_units")
    public void setGuiDistanceUnits(String guiDistanceUnits) {
        this.guiDistanceUnits = guiDistanceUnits;
    }

    @JsonProperty("gui_range_display")
    public String getGuiRangeDisplay() {
        return guiRangeDisplay;
    }

    @JsonProperty("gui_range_display")
    public void setGuiRangeDisplay(String guiRangeDisplay) {
        this.guiRangeDisplay = guiRangeDisplay;
    }

    @JsonProperty("gui_temperature_units")
    public String getGuiTemperatureUnits() {
        return guiTemperatureUnits;
    }

    @JsonProperty("gui_temperature_units")
    public void setGuiTemperatureUnits(String guiTemperatureUnits) {
        this.guiTemperatureUnits = guiTemperatureUnits;
    }

    @JsonProperty("show_range_units")
    public Boolean getShowRangeUnits() {
        return showRangeUnits;
    }

    @JsonProperty("show_range_units")
    public void setShowRangeUnits(Boolean showRangeUnits) {
        this.showRangeUnits = showRangeUnits;
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
