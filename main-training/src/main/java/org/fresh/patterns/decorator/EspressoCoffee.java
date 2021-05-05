package org.fresh.patterns.decorator;

public class EspressoCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "Coffee and Water";
    }
}
