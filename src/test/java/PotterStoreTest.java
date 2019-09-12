import com.java.PotterStore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PotterStoreTest {
    @Test
    public void emptyBasketTest() {

        double expected = 0.0d;
        double actual = PotterStore.checkout();
        assertTrue(expected - actual < 0.001);
    }
}
