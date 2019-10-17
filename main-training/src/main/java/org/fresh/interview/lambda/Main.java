package org.fresh.interview.lambda;

public class Main {
    public static void main(String[] args) {
        NumericTest isNegative = (n) -> n < 0;
        System.out.println(isNegative.test(1));
    }
}
