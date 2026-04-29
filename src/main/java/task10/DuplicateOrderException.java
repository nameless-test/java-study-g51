package task10;

public class DuplicateOrderException extends RuntimeException {
    private final int orderId;

    public DuplicateOrderException (int orderId) {
        super("Order " + orderId + " is duplicate");
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }
}
