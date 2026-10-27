package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyStatusTest {

    @Test
    public void testRegularDiscount() {
        LoyaltyStatus loyalty =
            new LoyaltyStatus(LoyaltyStatus.Status.REGULAR);

        assertEquals(100.00, loyalty.applyDiscount(100.00), 0.001);
    }

    @Test
    public void testSilverDiscount() {
        LoyaltyStatus loyalty =
            new LoyaltyStatus(LoyaltyStatus.Status.SILVER);

        assertEquals(95.00, loyalty.applyDiscount(100.00), 0.001);
    }

    @Test
    public void testGoldDiscount() {
        LoyaltyStatus loyalty =
            new LoyaltyStatus(LoyaltyStatus.Status.GOLD);

        assertEquals(90.00, loyalty.applyDiscount(100.00), 0.001);
    }
}