package task6;

public abstract class Order {

    int orderNumber;

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public abstract double getPrice();

    public void printOrderInfo() {
        System.out.println("Order: " + orderNumber);
    }

}
