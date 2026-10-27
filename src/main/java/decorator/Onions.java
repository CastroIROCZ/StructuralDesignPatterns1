package decorator;

public class Onions extends ToppingDecorator {

    public Onions(FoodItem foodItem) {
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