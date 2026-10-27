package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodItemTest {

    @Test
    public void testBurger() {
        FoodItem burger = new Burger();

        assertEquals(5.00, burger.getCost(), 0.001);
        assertEquals("Burger", burger.getDescription());
    }

    @Test
    public void testFries() {
        FoodItem fries = new Fries();

        assertEquals(3.00, fries.getCost(), 0.001);
        assertEquals("Fries", fries.getDescription());
    }

    @Test
    public void testHotDog() {
        FoodItem hotDog = new HotDog();

        assertEquals(4.00, hotDog.getCost(), 0.001);
        assertEquals("Hot Dog", hotDog.getDescription());
    }
}