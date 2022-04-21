package Homework.NewPractice.JSON.Try2.Response;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherResponse {
        @JsonIgnore
        private String LocalObservationDateTime;
        @JsonIgnore
        private float EpochTime;
        private String WeatherText;
        Temperature TemperatureObject;
        @JsonIgnore
        private String MobileLink;
        @JsonIgnore
        private String Link;

        @JsonCreator
        public WeatherResponse(@JsonProperty("LocalObservationDateTime") String LocalObservationDateTime, @JsonProperty("WeatherText") String WeatherText, @JsonProperty("Temperature") Temperature TemperatureObject) {
                this.WeatherText = WeatherText;
                this.TemperatureObject = TemperatureObject;
                this.LocalObservationDateTime = LocalObservationDateTime;
        }

        @Override
        public String toString() {
                return "Current WeatherText{" +
                        "погода= " + WeatherText +
                        ", температура= " + TemperatureObject + '\'' +
                        '}';
        }

        // Getter Methods

        public String getLocalObservationDateTime() {
                return LocalObservationDateTime;
        }

//    public float getEpochTime() {
//        return EpochTime;
//    }

        public String getWeatherText() {
                return WeatherText;
        }
        public Temperature getTemperature() {
                return TemperatureObject;
        }

        // Setter Methods

        public void setLocalObservationDateTime(String LocalObservationDateTime) {
                this.LocalObservationDateTime = LocalObservationDateTime;
        }

        public void setWeatherText(String WeatherText) {
                this.WeatherText = WeatherText;
        }

        public void setTemperature(Temperature TemperatureObject) {
                this.TemperatureObject = TemperatureObject;
        }


}
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "Headline",
//        "DailyForecasts"
//})
//@Generated("jsonschema2pojo")
//public class WeatherResponse {
//
//        @JsonProperty("Headline")
//        private Headline headline;
//        @JsonProperty("DailyForecasts")
//        private List<DailyForecast> dailyForecasts = null;
//        @JsonIgnore
//        private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//
//        /**
//         * No args constructor for use in serialization
//         *
//         */
//        public WeatherResponse() {
//        }
//
//        /**
//         *
//         * @param headline
//         * @param dailyForecasts
//         */
//        public WeatherResponse(Headline headline, List<DailyForecast> dailyForecasts) {
//                super();
//                this.headline = headline;
//                this.dailyForecasts = dailyForecasts;
//        }
//
//        @JsonProperty("Headline")
//        public Headline getHeadline() {
//                return headline;
//        }
//
//        @JsonProperty("Headline")
//        public void setHeadline(Headline headline) {
//                this.headline = headline;
//        }
//
//        @JsonProperty("DailyForecasts")
//        public List<DailyForecast> getDailyForecasts() {
//                return dailyForecasts;
//        }
//
//        @JsonProperty("DailyForecasts")
//        public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
//                this.dailyForecasts = dailyForecasts;
//        }
//
//        @JsonAnyGetter
//        public Map<String, Object> getAdditionalProperties() {
//                return this.additionalProperties;
//        }
//
//        @JsonAnySetter
//        public void setAdditionalProperty(String name, Object value) {
//                this.additionalProperties.put(name, value);
//        }
//
//}
