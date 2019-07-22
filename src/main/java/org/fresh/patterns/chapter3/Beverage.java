package org.fresh.patterns.chapter3;

public abstract class Beverage {
    public String description = "Unknown";
    private boolean milk;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
