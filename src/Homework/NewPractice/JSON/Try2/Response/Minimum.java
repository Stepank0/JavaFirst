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
        "Value",
        "Unit",
        "UnitType"
})
@Generated("jsonschema2pojo")
public class Minimum {

    @JsonProperty("Value")
    private Float value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private Integer unitType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Minimum() {
    }

    /**
     *
     * @param unitType
     * @param unit
     * @param value
     */
    public Minimum(Float value, String unit, Integer unitType) {
        super();
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    @JsonProperty("Value")
    public Float getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Float value) {
        this.value = value;
    }

    @JsonProperty("Unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("Unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("UnitType")
    public Integer getUnitType() {
        return unitType;
    }

    @JsonProperty("UnitType")
    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
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
//        "Value",
//        "Unit",
//        "UnitType"
//})
//
//public class Minimum {
//
//    @JsonProperty("Value")
//    private Double value;
//    @JsonProperty("Unit")
//    private String unit;
//    @JsonProperty("UnitType")
//    private Integer unitType;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    @JsonProperty("Value")
//    public Double getValue() {
//        return value;
//    }
//
//    @JsonProperty("Value")
//    public void setValue(Double value) {
//        this.value = value;
//    }
//
//    @JsonProperty("Unit")
//    public String getUnit() {
//        return unit;
//    }
//
//    @JsonProperty("Unit")
//    public void setUnit(String unit) {
//        this.unit = unit;
//    }
//
//    @JsonProperty("UnitType")
//    public Integer getUnitType() {
//        return unitType;
//    }
//
//    @JsonProperty("UnitType")
//    public void setUnitType(Integer unitType) {
//        this.unitType = unitType;
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