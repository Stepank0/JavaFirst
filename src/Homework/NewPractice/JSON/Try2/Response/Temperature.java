package Homework.NewPractice.JSON.Try2.Response;



import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;



@JsonIgnoreProperties(ignoreUnknown = true)

public class Temperature {
    Metric MetricObject;

    @JsonCreator
    public Temperature(@JsonProperty("Metric") Metric MetricObject) {
        this.MetricObject = MetricObject;
    }

    @Override
    public String toString() {
        return "" + MetricObject;
    }

    // Getter Methods
    public Metric getMetric() {
        return MetricObject;
    }

    // Setter Methods
    public void setMetric(Metric MetricObject) {
        this.MetricObject = MetricObject;
    }
}

//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "Minimum",
//        "Maximum"
//})
//@Generated("jsonschema2pojo")
//public class Temperature {
//
//    @JsonProperty("Minimum")
//    private Minimum minimum;
//    @JsonProperty("Maximum")
//    private Maximum maximum;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//    /**
//     * No args constructor for use in serialization
//     *
//     */
//    public Temperature() {
//    }
//
//    /**
//     *
//     * @param maximum
//     * @param minimum
//     */
//    public Temperature(Minimum minimum, Maximum maximum) {
//        super();
//        this.minimum = minimum;
//        this.maximum = maximum;
//    }
//
//    @JsonProperty("Minimum")
//    public Minimum getMinimum() {
//        return minimum;
//    }
//
//    @JsonProperty("Minimum")
//    public void setMinimum(Minimum minimum) {
//        this.minimum = minimum;
//    }
//
//    @JsonProperty("Maximum")
//    public Maximum getMaximum() {
//        return maximum;
//    }
//
//    @JsonProperty("Maximum")
//    public void setMaximum(Maximum maximum) {
//        this.maximum = maximum;
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
//
