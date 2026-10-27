package decorator;

public class Burger implements FoodItem {

    @Override
    public double getCost() {
        return 0.0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}