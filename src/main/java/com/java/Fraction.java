package com.java;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        int gcdValue = gcd(numerator, denominator);
        this.numerator = numerator/gcdValue;
        this.denominator = denominator/gcdValue;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator * that.denominator + this.denominator * that.numerator,
                this.denominator * that.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == getClass()) {
            Fraction that = (Fraction) obj;
            return this.numerator == that.numerator && this.denominator == that.denominator;
        }
        return false;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            if (a == 0)
                return 1;
            else
                return a;
        return gcd(b,a % b);
    }
}
