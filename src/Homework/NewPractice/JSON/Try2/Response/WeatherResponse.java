
package Homework.NewPractice.JSON.Try2.Response;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LocalObservationDateTime",
        "EpochTime",
        "WeatherText",
        "WeatherIcon",
        "HasPrecipitation",
        "PrecipitationType",
        "IsDayTime",
        "Temperature",
        "MobileLink",
        "Link"
})
@Generated("jsonschema2pojo")
public class WeatherResponse {

    @JsonIgnore
    private String localObservationDateTime;
    @JsonIgnore
    private Integer epochTime;
    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonProperty("WeatherIcon")
    private Integer weatherIcon;
    @JsonIgnore
    private Boolean hasPrecipitation;
    @JsonIgnore
    private Object precipitationType;
    @JsonProperty("IsDayTime")
    private Boolean isDayTime;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonIgnore
    private String mobileLink;
    @JsonIgnore
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public WeatherResponse() {
    }


    public WeatherResponse(String localObservationDateTime, Integer epochTime, String weatherText, Integer weatherIcon, Boolean hasPrecipitation, Object precipitationType, Boolean isDayTime, Temperature temperature, String mobileLink, String link) {
        super();
        this.localObservationDateTime = localObservationDateTime;
        this.epochTime = epochTime;
        this.weatherText = weatherText;
        this.weatherIcon = weatherIcon;
        this.hasPrecipitation = hasPrecipitation;
        this.precipitationType = precipitationType;
        this.isDayTime = isDayTime;
        this.temperature = temperature;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    @JsonProperty("LocalObservationDateTime")
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    @JsonProperty("LocalObservationDateTime")
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    @JsonProperty("EpochTime")
    public Integer getEpochTime() {
        return epochTime;
    }

    @JsonProperty("EpochTime")
    public void setEpochTime(Integer epochTime) {
        this.epochTime = epochTime;
    }

    @JsonProperty("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }

    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @JsonProperty("WeatherIcon")
    public Integer getWeatherIcon() {
        return weatherIcon;
    }

    @JsonProperty("WeatherIcon")
    public void setWeatherIcon(Integer weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    @JsonProperty("HasPrecipitation")
    public Boolean getHasPrecipitation() {
        return hasPrecipitation;
    }

    @JsonProperty("HasPrecipitation")
    public void setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    @JsonProperty("PrecipitationType")
    public Object getPrecipitationType() {
        return precipitationType;
    }

    @JsonProperty("PrecipitationType")
    public void setPrecipitationType(Object precipitationType) {
        this.precipitationType = precipitationType;
    }

    @JsonProperty("IsDayTime")
    public Boolean getIsDayTime() {
        return isDayTime;
    }

    @JsonProperty("IsDayTime")
    public void setIsDayTime(Boolean isDayTime) {
        this.isDayTime = isDayTime;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
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
        StringBuilder sb = new StringBuilder();
        sb.append(WeatherResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("localObservationDateTime");
        sb.append('=');
        sb.append(((this.localObservationDateTime == null)?"<null>":this.localObservationDateTime));
        sb.append(',');
        sb.append("epochTime");
        sb.append('=');
        sb.append(((this.epochTime == null)?"<null>":this.epochTime));
        sb.append(',');
        sb.append("weatherText");
        sb.append('=');
        sb.append(((this.weatherText == null)?"<null>":this.weatherText));
        sb.append(',');
        sb.append("weatherIcon");
        sb.append('=');
        sb.append(((this.weatherIcon == null)?"<null>":this.weatherIcon));
        sb.append(',');
        sb.append("hasPrecipitation");
        sb.append('=');
        sb.append(((this.hasPrecipitation == null)?"<null>":this.hasPrecipitation));
        sb.append(',');
        sb.append("precipitationType");
        sb.append('=');
        sb.append(((this.precipitationType == null)?"<null>":this.precipitationType));
        sb.append(',');
        sb.append("isDayTime");
        sb.append('=');
        sb.append(((this.isDayTime == null)?"<null>":this.isDayTime));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("mobileLink");
        sb.append('=');
        sb.append(((this.mobileLink == null)?"<null>":this.mobileLink));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

