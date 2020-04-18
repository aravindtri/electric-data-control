
package com.electric.solaredge.rest.data.response.currentstate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastUpdateTime",
    "lifeTimeData",
    "lastYearData",
    "lastMonthData",
    "lastDayData",
    "currentPower",
    "measuredBy"
})
public class Overview {

    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;
    @JsonProperty("lifeTimeData")
    private LifeTimeData lifeTimeData;
    @JsonProperty("lastYearData")
    private LastYearData lastYearData;
    @JsonProperty("lastMonthData")
    private LastMonthData lastMonthData;
    @JsonProperty("lastDayData")
    private LastDayData lastDayData;
    @JsonProperty("currentPower")
    private CurrentPower currentPower;
    @JsonProperty("measuredBy")
    private String measuredBy;

    @JsonProperty("lastUpdateTime")
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    @JsonProperty("lastUpdateTime")
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @JsonProperty("lifeTimeData")
    public LifeTimeData getLifeTimeData() {
        return lifeTimeData;
    }

    @JsonProperty("lifeTimeData")
    public void setLifeTimeData(LifeTimeData lifeTimeData) {
        this.lifeTimeData = lifeTimeData;
    }

    @JsonProperty("lastYearData")
    public LastYearData getLastYearData() {
        return lastYearData;
    }

    @JsonProperty("lastYearData")
    public void setLastYearData(LastYearData lastYearData) {
        this.lastYearData = lastYearData;
    }

    @JsonProperty("lastMonthData")
    public LastMonthData getLastMonthData() {
        return lastMonthData;
    }

    @JsonProperty("lastMonthData")
    public void setLastMonthData(LastMonthData lastMonthData) {
        this.lastMonthData = lastMonthData;
    }

    @JsonProperty("lastDayData")
    public LastDayData getLastDayData() {
        return lastDayData;
    }

    @JsonProperty("lastDayData")
    public void setLastDayData(LastDayData lastDayData) {
        this.lastDayData = lastDayData;
    }

    @JsonProperty("currentPower")
    public CurrentPower getCurrentPower() {
        return currentPower;
    }

    @JsonProperty("currentPower")
    public void setCurrentPower(CurrentPower currentPower) {
        this.currentPower = currentPower;
    }

    @JsonProperty("measuredBy")
    public String getMeasuredBy() {
        return measuredBy;
    }

    @JsonProperty("measuredBy")
    public void setMeasuredBy(String measuredBy) {
        this.measuredBy = measuredBy;
    }

}
