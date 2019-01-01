package org.fresh.codewars.kata.kyu6.tddareacalculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

class Calculator {

    double getTotalArea(Shape... shapes) {
        BigDecimal bd = new BigDecimal(Arrays.stream(shapes).mapToDouble(Shape::getArea).sum());
        return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
