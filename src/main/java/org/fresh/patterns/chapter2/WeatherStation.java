package org.fresh.patterns.chapter2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
        wd.setMeasurements(80, 80, 80);
    }
}
