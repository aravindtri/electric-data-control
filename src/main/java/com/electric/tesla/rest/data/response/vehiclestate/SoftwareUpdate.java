
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
    "download_perc",
    "expected_duration_sec",
    "install_perc",
    "status",
    "version"
})
public class SoftwareUpdate {

    @JsonProperty("download_perc")
    private Double downloadPerc;
    @JsonProperty("expected_duration_sec")
    private Double expectedDurationSec;
    @JsonProperty("install_perc")
    private Double installPerc;
    @JsonProperty("status")
    private String status;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("download_perc")
    public Double getDownloadPerc() {
        return downloadPerc;
    }

    @JsonProperty("download_perc")
    public void setDownloadPerc(Double downloadPerc) {
        this.downloadPerc = downloadPerc;
    }

    @JsonProperty("expected_duration_sec")
    public Double getExpectedDurationSec() {
        return expectedDurationSec;
    }

    @JsonProperty("expected_duration_sec")
    public void setExpectedDurationSec(Double expectedDurationSec) {
        this.expectedDurationSec = expectedDurationSec;
    }

    @JsonProperty("install_perc")
    public Double getInstallPerc() {
        return installPerc;
    }

    @JsonProperty("install_perc")
    public void setInstallPerc(Double installPerc) {
        this.installPerc = installPerc;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
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
