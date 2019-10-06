package org.fresh.patterns.chapter2;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private double temp;
    private double humidity;
    private double pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> o.update(temp, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

}
