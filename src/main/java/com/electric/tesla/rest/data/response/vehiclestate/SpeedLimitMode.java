
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
    "active",
    "current_limit_mph",
    "max_limit_mph",
    "min_limit_mph",
    "pin_code_set"
})
public class SpeedLimitMode {

    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("current_limit_mph")
    private Double currentLimitMph;
    @JsonProperty("max_limit_mph")
    private Integer maxLimitMph;
    @JsonProperty("min_limit_mph")
    private Integer minLimitMph;
    @JsonProperty("pin_code_set")
    private Boolean pinCodeSet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("current_limit_mph")
    public Double getCurrentLimitMph() {
        return currentLimitMph;
    }

    @JsonProperty("current_limit_mph")
    public void setCurrentLimitMph(Double currentLimitMph) {
        this.currentLimitMph = currentLimitMph;
    }

    @JsonProperty("max_limit_mph")
    public Integer getMaxLimitMph() {
        return maxLimitMph;
    }

    @JsonProperty("max_limit_mph")
    public void setMaxLimitMph(Integer maxLimitMph) {
        this.maxLimitMph = maxLimitMph;
    }

    @JsonProperty("min_limit_mph")
    public Integer getMinLimitMph() {
        return minLimitMph;
    }

    @JsonProperty("min_limit_mph")
    public void setMinLimitMph(Integer minLimitMph) {
        this.minLimitMph = minLimitMph;
    }

    @JsonProperty("pin_code_set")
    public Boolean getPinCodeSet() {
        return pinCodeSet;
    }

    @JsonProperty("pin_code_set")
    public void setPinCodeSet(Boolean pinCodeSet) {
        this.pinCodeSet = pinCodeSet;
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
