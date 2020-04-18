
package com.electric.solaredge.rest.data.response.currentstate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overview"
})
public class CurrentState {

    @JsonProperty("overview")
    private Overview overview;

    @JsonProperty("overview")
    public Overview getOverview() {
        return overview;
    }

    @JsonProperty("overview")
    public void setOverview(Overview overview) {
        this.overview = overview;
    }

}
