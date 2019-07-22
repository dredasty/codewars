package org.fresh.patterns.chapter3;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Mocha";
    }

    public double cost() {
        return 0.88 + beverage.cost();
    }
}
