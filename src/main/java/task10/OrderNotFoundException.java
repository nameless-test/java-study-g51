package task10;

public class OrderNotFoundException extends RuntimeException {
   private final int orderId;

    public OrderNotFoundException (int orderId) {
      super("Order " + orderId + " not found");
      this.orderId = orderId;
    }

    public int getOrderId() {
      return orderId;
    }
}
