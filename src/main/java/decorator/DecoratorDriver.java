package decorator;

public class DecoratorDriver {

    public static void main(String[] args) {

        System.out.println("Restaurant Ordering System");
        System.out.println("--------------------------");

        //Create a burger with cheese and onions
        FoodItem burger = new Burger();
        burger = new Cheese(burger);
        burger = new Onions(burger);

        //Create fries with ketchup
        FoodItem fries = new Fries();
        fries = new Ketchup(fries);

        //Create a hot dog with onions
        FoodItem hotDog = new HotDog();
        hotDog = new Onions(hotDog);

        //Create an order and add food items
        Order order = new Order();

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        //Display food items and their prices
        System.out.println(burger.getDescription() + ": $" + String.format("%.2f", burger.getCost()));
        System.out.println(fries.getDescription() + ": $" + String.format("%.2f", fries.getCost()));
        System.out.println(hotDog.getDescription() + ": $" + String.format("%.2f", hotDog.getCost()));

        System.out.println();

        //Calculate the order total
        double total = order.getTotal();

        System.out.println("Order Total: $" + String.format("%.2f", total));

        //Apply a gold loyalty discount
        LoyaltyStatus loyalty = new LoyaltyStatus(LoyaltyStatus.Status.GOLD);

        double discountedTotal = loyalty.applyDiscount(total);

        System.out.println("Loyalty Status: GOLD");
        System.out.println("Discount: 10%");
        System.out.println("Discounted Total: $" + String.format("%.2f", discountedTotal));
    }
}