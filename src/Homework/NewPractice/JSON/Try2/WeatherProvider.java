package Homework.NewPractice.JSON.Try2;

import Homework.NewPractice.JSON.Try2.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;



public interface WeatherProvider {
    //void getWeather1(Periods periods) throws IOException;

    WeatherData getWeather(Periods periods) throws IOException, SQLException;

    WeatherData getAllFromDb() throws IOException, SQLException;

}