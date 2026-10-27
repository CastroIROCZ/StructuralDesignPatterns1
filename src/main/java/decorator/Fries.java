package decorator;

public class Fries implements FoodItem {

    @Override
    public double getCost() {
        return 3.00;
    }

    @Override
    public String getDescription() {
        return "Fries";
    }
}