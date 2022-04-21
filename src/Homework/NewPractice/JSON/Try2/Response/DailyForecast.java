package Homework.NewPractice.JSON.Try2.Response;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Date",
        "EpochDate",
        "Temperature",
        "Day",
        "Night",
        "Sources",
        "MobileLink",
        "Link"
})
//@Generated("jsonschema2pojo")
public class DailyForecast {

    @JsonProperty("Date")
    private String date;
    @JsonProperty("EpochDate")
    private Integer epochDate;
    @JsonProperty("Temperature")
    private Temperature5days temperature;
    @JsonProperty("Day")
    private Day day;
    @JsonProperty("Night")
    private Night night;
    @JsonProperty("Sources")
    private List<String> sources = null;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
        return date.substring(0, 10) + " ожидается ночью: " + night.getIconPhrase() + ", днём: " + day.getIconPhrase() + ", " + temperature;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("EpochDate")
    public Integer getEpochDate() {
        return epochDate;
    }

    @JsonProperty("EpochDate")
    public void setEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
    }

    @JsonProperty("Temperature")
    public Temperature5days getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature5days temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("Day")
    public Day getDay() {
        return day;
    }

    @JsonProperty("Day")
    public void setDay(Day day) {
        this.day = day;
    }

    @JsonProperty("Night")
    public Night getNight() {
        return night;
    }

    @JsonProperty("Night")
    public void setNight(Night night) {
        this.night = night;
    }

    @JsonProperty("Sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("Sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
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

}



//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "Date",
//        "EpochDate",
//        "Temperature",
//        "Day",
//        "Night",
//        "Sources",
//        "MobileLink",
//        "Link"
//})
//@Generated("jsonschema2pojo")
//public class DailyForecast {
//
//    @JsonProperty("Date")
//    private String date;
//    @JsonProperty("EpochDate")
//    private Integer epochDate;
//    @JsonProperty("Temperature")
//    private Temperature temperature;
//    @JsonProperty("Day")
//    private Day day;
//    @JsonProperty("Night")
//    private Night night;
//    @JsonProperty("Sources")
//    private List<String> sources = null;
//    @JsonProperty("MobileLink")
//    private String mobileLink;
//    @JsonProperty("Link")
//    private String link;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    /**
//     * No args constructor for use in serialization
//     *
//     */
//    public DailyForecast() {
//    }
//
//    /**
//     *
//     * @param date
//     * @param sources
//     * @param epochDate
//     * @param night
//     * @param temperature
//     * @param link
//     * @param day
//     * @param mobileLink
//     */
//    public DailyForecast(String date, Integer epochDate, Temperature temperature, Day day, Night night, List<String> sources, String mobileLink, String link) {
//        super();
//        this.date = date;
//        this.epochDate = epochDate;
//        this.temperature = temperature;
//        this.day = day;
//        this.night = night;
//        this.sources = sources;
//        this.mobileLink = mobileLink;
//        this.link = link;
//    }
//
//    @JsonProperty("Date")
//    public String getDate() {
//        return date;
//    }
//
//    @JsonProperty("Date")
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    @JsonProperty("EpochDate")
//    public Integer getEpochDate() {
//        return epochDate;
//    }
//
//    @JsonProperty("EpochDate")
//    public void setEpochDate(Integer epochDate) {
//        this.epochDate = epochDate;
//    }
//
//    @JsonProperty("Temperature")
//    public Temperature getTemperature() {
//        return temperature;
//    }
//
//    @JsonProperty("Temperature")
//    public void setTemperature(Temperature temperature) {
//        this.temperature = temperature;
//    }
//
//    @JsonProperty("Day")
//    public Day getDay() {
//        return day;
//    }
//
//    @JsonProperty("Day")
//    public void setDay(Day day) {
//        this.day = day;
//    }
//
//    @JsonProperty("Night")
//    public Night getNight() {
//        return night;
//    }
//
//    @JsonProperty("Night")
//    public void setNight(Night night) {
//        this.night = night;
//    }
//
//    @JsonProperty("Sources")
//    public List<String> getSources() {
//        return sources;
//    }
//
//    @JsonProperty("Sources")
//    public void setSources(List<String> sources) {
//        this.sources = sources;
//    }
//
//    @JsonProperty("MobileLink")
//    public String getMobileLink() {
//        return mobileLink;
//    }
//
//    @JsonProperty("MobileLink")
//    public void setMobileLink(String mobileLink) {
//        this.mobileLink = mobileLink;
//    }
//
//    @JsonProperty("Link")
//    public String getLink() {
//        return link;
//    }
//
//    @JsonProperty("Link")
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//}
