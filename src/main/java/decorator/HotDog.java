package decorator;

public class HotDog implements FoodItem {

    @Override
    public double getCost() {
        return 0.0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}