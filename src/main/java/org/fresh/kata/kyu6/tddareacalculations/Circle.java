package org.fresh.kata.kyu6.tddareacalculations;

class Circle implements Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
