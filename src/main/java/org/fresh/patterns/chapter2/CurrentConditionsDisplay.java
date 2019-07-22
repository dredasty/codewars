package org.fresh.patterns.chapter2;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Level;

@Log
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temp;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Current conditions: " + temp + " temperature and " + humidity + " humidity.");
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
