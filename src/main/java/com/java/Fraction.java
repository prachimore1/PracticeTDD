package com.java;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        if(this.denominator != that.denominator) {
            return reduce(new Fraction(this.numerator*that.denominator+this.denominator*that.numerator,this.denominator*that.denominator));
        } else {
            return reduce(new Fraction(this.numerator+that.numerator, denominator));
        }
    }

    @Override
    public boolean equals(Object obj) {
        Fraction that = (Fraction) obj;
        return this.numerator==that.numerator && this.denominator ==that.denominator;
    }

    public int getNum() {
        return this.numerator;
    }

    private Fraction reduce(Fraction result) {
        int gcdValue = gcd(result.numerator, result.denominator);
        return new Fraction(result.numerator/gcdValue, result.denominator/gcdValue);
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
