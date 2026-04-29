package task6;

public class CoffeeOrder extends Order {

    String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public CoffeeOrder(int orderNumber, String size) {
        super(orderNumber);
        this.size = size;
    }

    @Override
    public double getPrice() {
        if ("Small".equals(size)) {
            return 10;
        } else if ("Median".equals(size)) {
            return 15;
        } else {
            return 20;
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order " + orderNumber + ": " + size + " cofee");
    }

}
