package Homework.NewPractice.JSON.Try2;

import Homework.NewPractice.JSON.Try2.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

}
