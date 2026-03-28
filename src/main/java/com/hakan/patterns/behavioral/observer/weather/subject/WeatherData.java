package com.hakan.patterns.behavioral.observer.weather.subject;

import com.hakan.patterns.behavioral.observer.weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Float> temps;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
        this.temps = new ArrayList<>();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

    public List<Float> getTemps() {
        return this.temps;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        addTemp(temperature);
        measurementsChanged();

    }

    public void addTemp(float temp) {
        temps.add(temp);
    }

    // other WeatherData methods here
}
