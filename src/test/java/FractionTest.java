import com.java.Fraction;

import static  org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FractionTest {
    @Test
    public void zeroCheck() {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNonZeroCheck() {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    public void NegativePlusPositiveCheck() {
        assertEquals(new Fraction(1),new Fraction(-1).plus(new Fraction(2)));
    }

    @Test
    public void FractionsWithSameDenominator() {
        assertEquals(new Fraction(3,5),new Fraction(1,5).plus(new Fraction(2,5)));
    }

    @Test
    public void FractionsWithDiffDenominator() {
        assertEquals(new Fraction(5,6),new Fraction(1,2).plus(new Fraction(1,3)));
    }

    @Test
    public void FractionsPlusWithReduce() {
        assertEquals(new Fraction(1,2), new Fraction(1,6).plus(new Fraction(2,6)));
        assertEquals(new Fraction(8,9), new Fraction(4,6).plus(new Fraction(2,9)));
        assertEquals(new Fraction(3,8), new Fraction(1,4).plus(new Fraction(1,8)));
    }

    @Test
    public void FractionsPlusNegativeFraction() {
        assertEquals(new Fraction(1,4), new Fraction(-1,4).plus(new Fraction(3,6)));
    }

    @Test
    public void NegativeFractionPlusNegativeFraction() {
        assertEquals(new Fraction(-3,4), new Fraction(-1,2).plus(new Fraction(-1,4)));
        assertEquals(new Fraction(1,4), new Fraction(-1,-2).plus(new Fraction(-1,4)));
    }

    @Test
    public void NegativeFractionSubtractFromPositiveFraction() {
        assertEquals(new Fraction(1,4), new Fraction(1,2).subtract(new Fraction(1,4)));
    }

    @Test
    public void NegativeFractionSubtractFromNegativeFraction() {
        assertEquals(new Fraction(-1,12), new Fraction(1,4).subtract(new Fraction(1,3)));
    }

    @Test
    public void FractionMultiplyFraction() {
        assertEquals(new Fraction(1,4), new Fraction(1,2).mutiply(new Fraction(1,2)));
        assertEquals(new Fraction(1,6), new Fraction(1,4).mutiply(new Fraction(2,3)));
    }

    @Test
    public void FractionDivideFraction() {
        assertEquals(new Fraction(1), new Fraction(1,2).divide(new Fraction(1,2)));
        assertEquals(new Fraction(3,7), new Fraction(3,4).divide(new Fraction(7,4)));
    }

    @Test
    public void FractionDivideZero() {
        try {
            Fraction result = new Fraction(1,4).divide(new Fraction(0));
        } catch (Exception ex) {
            assertEquals(ArithmeticException.class, ex.getClass());
            assertEquals("Divide By Zero", ex.getMessage());
        }
    }
}
// Some unnecessary comment
