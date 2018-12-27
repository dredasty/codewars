package org.fresh.kata.kyu6.tddareacalculations;

class Triangle implements Shape {

    private double base;

    private double height;

    Triangle(Number base, Number height) {
        this.base = base.doubleValue();
        this.height = height.doubleValue();
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }
}
