package Homework.NewPractice.JSON.Try2.Response;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Icon",
        "IconPhrase",
        "HasPrecipitation"
})

public class Day {

    @JsonProperty("Icon")
    private Integer icon;
    @JsonProperty("IconPhrase")
    private String iconPhrase;
    @JsonProperty("HasPrecipitation")
    private Boolean hasPrecipitation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
        return ", днём: " + iconPhrase;
    }

    @JsonProperty("Icon")
    public Integer getIcon() {
        return icon;
    }

    @JsonProperty("Icon")
    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    @JsonProperty("IconPhrase")
    public String getIconPhrase() {
        return iconPhrase;
    }

    @JsonProperty("IconPhrase")
    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    @JsonProperty("HasPrecipitation")
    public Boolean getHasPrecipitation() {
        return hasPrecipitation;
    }

    @JsonProperty("HasPrecipitation")
    public void setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
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
//        "Icon",
//        "IconPhrase",
//        "HasPrecipitation",
//        "PrecipitationType",
//        "PrecipitationIntensity"
//})
//@Generated("jsonschema2pojo")
//public class Day {
//
//    @JsonProperty("Icon")
//    private Integer icon;
//    @JsonProperty("IconPhrase")
//    private String iconPhrase;
//    @JsonProperty("HasPrecipitation")
//    private Boolean hasPrecipitation;
//    @JsonProperty("PrecipitationType")
//    private String precipitationType;
//    @JsonProperty("PrecipitationIntensity")
//    private String precipitationIntensity;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    /**
//     * No args constructor for use in serialization
//     *
//     */
//    public Day() {
//    }
//
//    /**
//     *
//     * @param hasPrecipitation
//     * @param precipitationIntensity
//     * @param precipitationType
//     * @param icon
//     * @param iconPhrase
//     */
//    public Day(Integer icon, String iconPhrase, Boolean hasPrecipitation, String precipitationType, String precipitationIntensity) {
//        super();
//        this.icon = icon;
//        this.iconPhrase = iconPhrase;
//        this.hasPrecipitation = hasPrecipitation;
//        this.precipitationType = precipitationType;
//        this.precipitationIntensity = precipitationIntensity;
//    }
//
//    @JsonProperty("Icon")
//    public Integer getIcon() {
//        return icon;
//    }
//
//    @JsonProperty("Icon")
//    public void setIcon(Integer icon) {
//        this.icon = icon;
//    }
//
//    @JsonProperty("IconPhrase")
//    public String getIconPhrase() {
//        return iconPhrase;
//    }
//
//    @JsonProperty("IconPhrase")
//    public void setIconPhrase(String iconPhrase) {
//        this.iconPhrase = iconPhrase;
//    }
//
//    @JsonProperty("HasPrecipitation")
//    public Boolean getHasPrecipitation() {
//        return hasPrecipitation;
//    }
//
//    @JsonProperty("HasPrecipitation")
//    public void setHasPrecipitation(Boolean hasPrecipitation) {
//        this.hasPrecipitation = hasPrecipitation;
//    }
//
//    @JsonProperty("PrecipitationType")
//    public String getPrecipitationType() {
//        return precipitationType;
//    }
//
//    @JsonProperty("PrecipitationType")
//    public void setPrecipitationType(String precipitationType) {
//        this.precipitationType = precipitationType;
//    }
//
//    @JsonProperty("PrecipitationIntensity")
//    public String getPrecipitationIntensity() {
//        return precipitationIntensity;
//    }
//
//    @JsonProperty("PrecipitationIntensity")
//    public void setPrecipitationIntensity(String precipitationIntensity) {
//        this.precipitationIntensity = precipitationIntensity;
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
