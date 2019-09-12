package com.java;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Divide By Zero");
        }
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

    public Fraction subtract(Fraction that) {
        return new Fraction(this.numerator * that.denominator - this.denominator * that.numerator,
                this.denominator * that.denominator);
    }

    public Fraction multiply(Fraction that) {
        return new Fraction(this.numerator * that.numerator,this.denominator * that.denominator);
    }

    public Fraction divide(Fraction that) {
        return multiply(new Fraction(that.denominator, that.numerator));
    }
}
