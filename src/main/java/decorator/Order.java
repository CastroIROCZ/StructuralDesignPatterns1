package decorator;

import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0.0;

        for (FoodItem item : items) {
            total += item.getCost();
        }

        return total;
    }
}