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
        "EffectiveDate",
        "EffectiveEpochDate",
        "Severity",
        "Text",
        "Category",
        "EndDate",
        "EndEpochDate",
        "MobileLink",
        "Link"
})
@Generated("jsonschema2pojo")
public class Headline {

    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("EffectiveEpochDate")
    private Integer effectiveEpochDate;
    @JsonProperty("Severity")
    private Integer severity;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("EndEpochDate")
    private Integer endEpochDate;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Headline() {
    }

    /**
     *
     * @param severity
     * @param endEpochDate
     * @param effectiveEpochDate
     * @param endDate
     * @param link
     * @param text
     * @param category
     * @param mobileLink
     * @param effectiveDate
     */
    public Headline(String effectiveDate, Integer effectiveEpochDate, Integer severity, String text, String category, String endDate, Integer endEpochDate, String mobileLink, String link) {
        super();
        this.effectiveDate = effectiveDate;
        this.effectiveEpochDate = effectiveEpochDate;
        this.severity = severity;
        this.text = text;
        this.category = category;
        this.endDate = endDate;
        this.endEpochDate = endEpochDate;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public Integer getEffectiveEpochDate() {
        return effectiveEpochDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public void setEffectiveEpochDate(Integer effectiveEpochDate) {
        this.effectiveEpochDate = effectiveEpochDate;
    }

    @JsonProperty("Severity")
    public Integer getSeverity() {
        return severity;
    }

    @JsonProperty("Severity")
    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    @JsonProperty("Text")
    public String getText() {
        return text;
    }

    @JsonProperty("Text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("EndEpochDate")
    public Integer getEndEpochDate() {
        return endEpochDate;
    }

    @JsonProperty("EndEpochDate")
    public void setEndEpochDate(Integer endEpochDate) {
        this.endEpochDate = endEpochDate;
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
//        "EffectiveDate",
//        "EffectiveEpochDate",
//        "Severity",
//        "Text",
//        "Category",
//        "EndDate",
//        "EndEpochDate",
//        "MobileLink",
//        "Link"
//})
//
//public class Headline {
//
//    @JsonProperty("EffectiveDate")
//    private String effectiveDate;
//    @JsonProperty("EffectiveEpochDate")
//    private Integer effectiveEpochDate;
//    @JsonProperty("Severity")
//    private Integer severity;
//    @JsonProperty("Text")
//    private String text;
//    @JsonProperty("Category")
//    private String category;
//    @JsonProperty("EndDate")
//    private Object endDate;
//    @JsonProperty("EndEpochDate")
//    private Object endEpochDate;
//    @JsonProperty("MobileLink")
//    private String mobileLink;
//    @JsonProperty("Link")
//    private String link;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonProperty("EffectiveDate")
//    public String getEffectiveDate() {
//        return effectiveDate;
//    }
//
//    @JsonProperty("EffectiveDate")
//    public void setEffectiveDate(String effectiveDate) {
//        this.effectiveDate = effectiveDate;
//    }
//
//    @JsonProperty("EffectiveEpochDate")
//    public Integer getEffectiveEpochDate() {
//        return effectiveEpochDate;
//    }
//
//    @JsonProperty("EffectiveEpochDate")
//    public void setEffectiveEpochDate(Integer effectiveEpochDate) {
//        this.effectiveEpochDate = effectiveEpochDate;
//    }
//
//    @JsonProperty("Severity")
//    public Integer getSeverity() {
//        return severity;
//    }
//
//    @JsonProperty("Severity")
//    public void setSeverity(Integer severity) {
//        this.severity = severity;
//    }
//
//    @JsonProperty("Text")
//    public String getText() {
//        return text;
//    }
//
//    @JsonProperty("Text")
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    @JsonProperty("Category")
//    public String getCategory() {
//        return category;
//    }
//
//    @JsonProperty("Category")
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    @JsonProperty("EndDate")
//    public Object getEndDate() {
//        return endDate;
//    }
//
//    @JsonProperty("EndDate")
//    public void setEndDate(Object endDate) {
//        this.endDate = endDate;
//    }
//
//    @JsonProperty("EndEpochDate")
//    public Object getEndEpochDate() {
//        return endEpochDate;
//    }
//
//    @JsonProperty("EndEpochDate")
//    public void setEndEpochDate(Object endEpochDate) {
//        this.endEpochDate = endEpochDate;
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