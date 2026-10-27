package decorator;

import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {

    }

    public double getTotal() {
        return 0.0;
    }
}