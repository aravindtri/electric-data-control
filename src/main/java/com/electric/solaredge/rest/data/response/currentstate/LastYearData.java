
package com.electric.solaredge.rest.data.response.currentstate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "energy"
})
public class LastYearData {

    @JsonProperty("energy")
    private Double energy;

    @JsonProperty("energy")
    public Double getEnergy() {
        return energy;
    }

    @JsonProperty("energy")
    public void setEnergy(Double energy) {
        this.energy = energy;
    }

}
