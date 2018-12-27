package org.fresh.kata.kyu6.tddareacalculations;

class Square implements Shape {

    private double side;

    Square(Number side) {
        this.side = side.doubleValue();
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
