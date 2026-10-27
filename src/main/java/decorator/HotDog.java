package decorator;

public class HotDog implements FoodItem {

    @Override
    public double getCost() {
        return 4.00;
    }

    @Override
    public String getDescription() {
        return "Hot Dog";
    }
}