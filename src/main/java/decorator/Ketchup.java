package decorator;

public class Ketchup extends ToppingDecorator {

    public Ketchup(FoodItem foodItem) {
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