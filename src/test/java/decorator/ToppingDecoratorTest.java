package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToppingDecoratorTest {

    @Test
    public void testCheese() {
        FoodItem burger = new Cheese(new Burger());

        assertEquals(6.00, burger.getCost(), 0.001);
        assertEquals("Burger, Cheese", burger.getDescription());
    }

    @Test
    public void testKetchup() {
        FoodItem fries = new Ketchup(new Fries());

        assertEquals(3.25, fries.getCost(), 0.001);
        assertEquals("Fries, Ketchup", fries.getDescription());
    }

    @Test
    public void testOnions() {
        FoodItem hotDog = new Onions(new HotDog());

        assertEquals(4.50, hotDog.getCost(), 0.001);
        assertEquals("Hot Dog, Onions", hotDog.getDescription());
    }

    @Test
    public void testMultipleToppings() {
        FoodItem burger = new Onions(new Cheese(new Burger()));

        assertEquals(6.50, burger.getCost(), 0.001);
        assertEquals("Burger, Cheese, Onions", burger.getDescription());
    }
}