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
        return 0.0;
    }
}