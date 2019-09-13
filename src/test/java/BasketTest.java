import com.java.Basket;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BasketTest {
    @Test
    public void getEmptyBasket() {
        Basket basket =new Basket();
        assertEquals(basket.getBooks(), new ArrayList<Integer>());
    }

    @Test
    public void getBasketWithOneBook() {
        Basket basket = new Basket();
        basket.add(1);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1));
        assertEquals(basket.getBooks(), expected);
    }

    @Test
    public void getBasketWithTwoBooks() {
        Basket basket = new Basket();
        basket.add(1);
        basket.add(2);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2));
        assertEquals(basket.getBooks(), expected);
    }
    @Test
    public void getBasketWithTwoSameBooks() {
        Basket basket = new Basket();
        basket.add(1);
        basket.add(1);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 1));
        assertEquals(basket.getBooks(), expected);
    }
    @Test
    public void getBasketWithAssortedBooks() {
        Basket basket = new Basket();
        basket.add(1);
        basket.add(2);
        basket.add(1);
        basket.add(3);
        basket.add(2);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3));
        assertEquals(basket.getBooks(), expected);
    }

    @Test
    public void getBasketWithNotValidBookIndex() {
        Basket basket = new Basket();
        basket.add(-20);
        assertEquals(basket.getBooks(), new ArrayList<Integer>());
    }
}
