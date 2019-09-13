import com.java.Basket;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PotterStoreTest {
    @Test
    public void emptyBasketTest() {
        Basket basket = new Basket();
        double actual = basket.checkout();
        assertTrue(0.0d - actual < 0.001);
    }

    @Test
    public void twoDiffBooksTest() {
        Basket basket = new Basket();
        basket.add(1);
        basket.add(2);
        double actual = basket.checkout();
        assertTrue(8.0d - actual < 0.001);
    }

    @Test
    public void fiveDiffBooks() {
        Basket basket = new Basket();
        basket.add(1);
        basket.add(3);
        basket.add(4);
        basket.add(2);
        basket.add(5);
        double actual = basket.checkout();
        assertTrue(0.0d - actual < 0.001);
    }


}
