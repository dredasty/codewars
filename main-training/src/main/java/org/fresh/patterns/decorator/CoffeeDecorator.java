package org.fresh.patterns.decorator;

public class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}
