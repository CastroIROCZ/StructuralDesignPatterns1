package decorator;

public class Cheese extends ToppingDecorator {

    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return 0.0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}