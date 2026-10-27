package decorator;

public class Ketchup extends ToppingDecorator {

    public Ketchup(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.25;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Ketchup";
    }
}