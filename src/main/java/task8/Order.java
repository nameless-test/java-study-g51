package task8;

import java.util.Arrays;

public abstract class Order implements Printable, Priceable {

    private int orderNumber;
    private static int counter = 1001;
    private String orderStatus = "NEW";
    private final String[] orderStatusOptions = {"NEW", "COMPLETED", "CANCELED"};

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        boolean status = false;
        for (String s : orderStatusOptions) {
            if (orderStatus.equals(s)) {
                this.orderStatus = orderStatus;
                status = true;
                break;
            }
        }
        if (!status) {
            throw new java.lang.Error(orderStatus + " is incorrect status. Try: " + Arrays.toString(orderStatusOptions));
        }
    }

    
    @Override
    public String toString() {
        return "Order #" + getOrderNumber() + " (" + getOrderStatus() + ")";
    }
//Методи інтерфейсів імплементовані у дочірніх класах

    public Order() {
        this.orderNumber = counter;
        counter++;
    }

}
