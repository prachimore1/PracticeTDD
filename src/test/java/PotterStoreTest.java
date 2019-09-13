import com.java.Basket;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PotterStoreTest {

    Basket basketTest;

    @Test
    public void emptyBasketTest() {
        basketTest = new Basket();
        double actual = basketTest.checkout();
        assertTrue(0.0d - actual < 0.001 && 0.0d - actual > -0.001d);
    }

    @Test
    public void twoDiffBooksTest() {
        basketTest = new Basket();
        basketTest.add(1);
        basketTest.add(2);
        double actual = basketTest.checkout();
        assertTrue(16.0d - actual < 0.001 && 16.0d - actual > -0.001);
    }

    @Test
    public void fiveDiffBooks() {
        basketTest = new Basket();
        basketTest.add(1);
        basketTest.add(3);
        basketTest.add(4);
        basketTest.add(2);
        basketTest.add(5);
        double actual = basketTest.checkout();
        assertTrue(40.0d - actual < 0.001 && 40.0d - actual > -0.001);
    }

    @Test
    @Ignore
    public void twoSameBooksTest() {
        basketTest = new Basket();
        basketTest.add(1);
        basketTest.add(1);
        double actual = basketTest.checkout();
        assertTrue(15.2  - actual < 0.001 && 15.2  - actual > -0.001);
    }
}
