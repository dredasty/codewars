package org.fresh.kata.kyu6.fraction;

/**
 * https://www.codewars.com/kata/fractions-class/train/java
 */
public class Fraction implements Comparable<Fraction> {

    private final long top;

    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    // Your work here!

    //Add two fractions
    public Fraction add(Fraction f2) {
        Fraction new1 = simplify(this);
        Fraction new2 = simplify(f2);
        long x = lcm(new1.bottom, new2.bottom);
        return new Fraction(new1.top * (x / new1.bottom) + new2.top * (x / new2.bottom), x);
    }

    private Fraction simplify(Fraction fraction) {
        long gcd = gcd(fraction.top, fraction.bottom);
        return new Fraction(fraction.top / gcd, fraction.bottom / gcd);
    }

    private long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public long gcd(long p, long q) {
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }

    @Override
    public String toString() {
        Fraction newF = simplify(this);
        return newF.top + "/" + newF.bottom;
    }
}
