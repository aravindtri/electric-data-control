
package com.electric.solaredge.rest.data.response.currentstate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "power"
})
public class CurrentPower {

    @JsonProperty("power")
    private Double power;

    @JsonProperty("power")
    public Double getPower() {
        return power;
    }

    @JsonProperty("power")
    public void setPower(Double power) {
        this.power = power;
    }

}
