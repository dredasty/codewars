package org.fresh.patterns.observer;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public class EventSource {
    private final List<Observer> observers = new ArrayList<>();

    private void notifyObservers(String event) {
        observers.forEach(observer -> observer.update(event));
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        int i = 1;
        while (i++ < 5) {
            notifyObservers(RandomStringUtils.randomAlphanumeric(i));
        }
    }
}
