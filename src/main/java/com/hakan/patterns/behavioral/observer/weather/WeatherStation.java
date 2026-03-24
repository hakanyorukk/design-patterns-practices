package com.hakan.patterns.behavioral.observer.weather;

import com.hakan.patterns.behavioral.observer.weather.observer.CurrentConditionsDisplay;
import com.hakan.patterns.behavioral.observer.weather.observer.ForecastDisplay;
import com.hakan.patterns.behavioral.observer.weather.observer.StatisticsDisplay;
import com.hakan.patterns.behavioral.observer.weather.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
