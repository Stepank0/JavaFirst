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
        "Icon",
        "IconPhrase",
        "HasPrecipitation"
})
@Generated("jsonschema2pojo")
public class Night {

    @JsonProperty("Icon")
    private Integer icon;
    @JsonProperty("IconPhrase")
    private String iconPhrase;
    @JsonProperty("HasPrecipitation")
    private Boolean hasPrecipitation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Night() {
    }

    /**
     *
     * @param hasPrecipitation
     * @param icon
     * @param iconPhrase
     */
    public Night(Integer icon, String iconPhrase, Boolean hasPrecipitation) {
        super();
        this.icon = icon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
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
//import java.util.HashMap;
//import java.util.Map;
//
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "Icon",
//        "IconPhrase",
//        "HasPrecipitation"
//})
//
//public class Night {
//
//    @JsonProperty("Icon")
//    private Integer icon;
//    @JsonProperty("IconPhrase")
//    private String iconPhrase;
//    @JsonProperty("HasPrecipitation")
//    private Boolean hasPrecipitation;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
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