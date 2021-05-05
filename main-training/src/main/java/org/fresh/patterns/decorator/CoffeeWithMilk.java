package org.fresh.patterns.decorator;

public class CoffeeWithMilk extends CoffeeDecorator {
    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " and Milk";
    }
}
