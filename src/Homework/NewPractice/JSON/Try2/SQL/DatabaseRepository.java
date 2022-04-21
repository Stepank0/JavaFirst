package Homework.NewPractice.JSON.Try2.SQL;

import Homework.NewPractice.JSON.Try2.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws IOException, SQLException;
}