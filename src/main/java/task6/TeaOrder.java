package task6;

public class TeaOrder extends Order {

    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TeaOrder(int orderNumber, String type) {
        super(orderNumber);
        this.type = type;
    }

    @Override
    public double getPrice() {
        if ("Black".equals(type)) {
            return 50;
        } else if ("Green".equals(type)) {
            return 60;
        } else {
            return 70;
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order " + orderNumber + ": " + type + " tea");
    }

}
