package com.hakan.patterns.behavioral.observer.weather.observer;

import com.hakan.patterns.behavioral.observer.weather.subject.WeatherData;

import java.util.List;

public class AvgMinMaxDisplay implements DisplayElement, Observer {
    private float humidity;
    private float temperature;
    private List<Float> temps;
    private WeatherData weatherData;

    public AvgMinMaxDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.temps = weatherData.getTemps();
        weatherData.registerObserver(this);
    }

    public float avgTemp() {
        float totalTemp = 0;
        for(Float t : temps) {
            totalTemp += t;
        }
        if(temps.size() <=0 ) {
            return totalTemp;
        }

        return totalTemp / temps.size();
    }

    public float maxTemp() {
        float maxTemp = temps.getFirst();
        for(Float t : temps) {
            if(t>maxTemp) {
                maxTemp = t;
            }
        }
        return maxTemp;
    }

    public float minTemp() {
        float minTemp = temps.getFirst();
        for(Float t : temps) {
            if(t<minTemp) {
                minTemp = t;
            }
        }
        return minTemp;
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemp() +"/" + maxTemp() + "/" + minTemp());
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.temps = weatherData.getTemps();
        display();
    }
}
