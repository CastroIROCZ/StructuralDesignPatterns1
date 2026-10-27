package decorator;

public class LoyaltyStatus {

    public enum Status {
        REGULAR,
        SILVER,
        GOLD
    }

    private Status status;

    public LoyaltyStatus(Status status) {
        this.status = status;
    }

    public double applyDiscount(double total) {
        double discount = 0.0;

        switch (status) {
            case REGULAR:
                discount = 0.0;
                break;

            case SILVER:
                discount = 0.05;
                break;

            case GOLD:
                discount = 0.10;
                break;
        }

        return total - (total * discount);
    }
}