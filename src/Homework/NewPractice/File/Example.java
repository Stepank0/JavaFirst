package Homework.NewPractice.File;

import okhttp3.*;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Example {

    static Properties prop = new Properties();

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFailure(true)
                .build();


        String jsonBody = "{" +
                "\"firstname\" : \"Jim\"," +
                "\"lastname\" : \"Brown\"," +
                "\"totalprice\" : 111, " +
                "\"depositpaid\" : true," +
                "\"bookingdates\" : {" +
                "\"checkin\" : \"2018-01-01\"," +
                "\"checkout\" : \"2019-01-01\" }, " +
                "\"additionalneeds\" : \"Breakfast\" }";

        RequestBody createBookingBody = RequestBody.create(jsonBody, MediaType.parse("application/json"));
        Request request = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking")
                .addHeader("accept", "application/json")
                .post(createBookingBody)
                .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.headers());
        System.out.println(response.body().string());


    }

}
