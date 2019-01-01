package org.fresh.codewars.kata.kyu6.tddareacalculations;

class Rectangle implements Shape {

    private double height;

    private double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
