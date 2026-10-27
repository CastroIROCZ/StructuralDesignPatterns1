package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testAddItemAndGetTotal() {
        Order order = new Order();

        order.addItem(new Burger());
        order.addItem(new Fries());
        order.addItem(new HotDog());

        assertEquals(12.00, order.getTotal(), 0.001);
    }

    @Test
    public void testOrderWithToppings() {
        Order order = new Order();

        FoodItem burger = new Cheese(new Burger());
        FoodItem fries = new Ketchup(new Fries());

        order.addItem(burger);
        order.addItem(fries);

        assertEquals(9.25, order.getTotal(), 0.001);
    }

    @Test
    public void testEmptyOrder() {
        Order order = new Order();

        assertEquals(0.00, order.getTotal(), 0.001);
    }
}