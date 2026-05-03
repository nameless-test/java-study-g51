package task11;

public abstract class Order implements Printable, Priceable {

    private int orderNumber;
    private static int counter = 1001;
    private OrderStatus orderStatus = OrderStatus.NEW;
    
    @Override
    public String toString() {
        return "Order #" + getOrderNumber() + " (" + getOrderStatus() + ")";
    }

    public Order() {
        this.orderNumber = counter;
        counter++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {   
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus == OrderStatus.NEW || orderStatus == OrderStatus.COMPLETED || orderStatus == OrderStatus.CANCELED) {
            this.orderStatus = orderStatus;
        }
    }

}
