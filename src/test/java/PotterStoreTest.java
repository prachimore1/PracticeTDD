import com.java.Basket;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PotterStoreTest {

    public static final double THRESHOLD = 0.001;
    Basket basketTest;


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void emptyBasketTest() {
        basketTest = new Basket();
        double actual = basketTest.checkout();
        assertTrue(0.0d - actual < THRESHOLD && 0.0d - actual > -THRESHOLD);
    }

    @Test
    public void twoSameBooksTest() {
        basketTest = new Basket();
        basketTest.add(1);
        basketTest.add(1);
        double actual = basketTest.checkout();
        assertTrue(16.0d - actual < THRESHOLD && 16.0d - actual > -THRESHOLD);
    }

    @Test
    public void fiveSameBooks() {
        basketTest = new Basket();
        basketTest.add(1);
        basketTest.add(1);
        basketTest.add(1);
        basketTest.add(1);
        basketTest.add(1);
        double actual = basketTest.checkout();
        assertTrue(40.0d - actual < THRESHOLD && 40.0d - actual > -THRESHOLD);
    }

    @Test
    public void twoDiffBooksTest() {
        basketTest = new Basket();
        basketTest.add(1);
        basketTest.add(2);
        double actual = basketTest.checkout();
        assertTrue(15.2  - actual < THRESHOLD && 15.2  - actual > -THRESHOLD);
    }
}
