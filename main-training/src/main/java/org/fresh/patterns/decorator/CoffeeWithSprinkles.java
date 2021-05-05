package org.fresh.patterns.decorator;

public class CoffeeWithSprinkles extends CoffeeDecorator {
    public CoffeeWithSprinkles(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " and Sprinkles";
    }
}
