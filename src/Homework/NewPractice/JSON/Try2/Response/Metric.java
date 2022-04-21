
package Homework.NewPractice.JSON.Try2.Response;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Metric {
    private Double Value;

    @JsonCreator
    public Metric(@JsonProperty("Value") Double Value) {
        this.Value = Value;
    }

    @Override
    public String toString() {
        return "" + Value;
    }

    // Getter Methods
    public Double getValue() {
        return Value;
    }

    // Setter Methods
    public void setValue(Double Value) {
        this.Value = Value;
    }

}