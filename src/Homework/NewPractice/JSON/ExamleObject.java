package Homework.NewPractice.JSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExamleObject {

    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST_ENDPOINT = "forecasts";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String API_VERSION = "v1";
    private static final String API_KEY = "BmKTX3bWs8Y0py0dR6s9tBuVRx0gRZM6";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";
    private static final  String SAINT_PETERSBURG_KEY ="474212_PC";



        public static void main(String[] args) throws IOException {

            OkHttpClient client = new OkHttpClient();

            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host(BASE_HOST)
                    .addPathSegment(FORECAST_ENDPOINT)
                    .addPathSegment(API_VERSION)
                    .addPathSegment(FORECAST_TYPE)
                    .addPathSegment(FORECAST_PERIOD)
                    .addPathSegment(SAINT_PETERSBURG_KEY)
                    .addQueryParameter("apikey", API_KEY)
                    .addQueryParameter("language", "ru-ru")
                    .addQueryParameter("metric", "true")
                    .build();

            Request requesthttp = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            String jsonResponse = client.newCall(requesthttp).execute().body().string();
//            System.out.println(jsonResponse);



            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(jsonResponse);
            System.out.println(jsonString);

            JsonNode jsonNode = objectMapper
                    .readTree(jsonString)
                    .at("DailyForecasts/Date/Temperature");

            System.out.println(jsonNode.asText());




        }


}
