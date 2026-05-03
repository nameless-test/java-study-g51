package task6;

public class DessertOrder extends Order {

    String dessertName;

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public DessertOrder(int orderNumber, String dessertName) {
        super(orderNumber);
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
        if ("Cake".equals(dessertName)) {
            return 100;
        } else if ("Pie".equals(dessertName)) {
            return 150;
        } else {
            return 200;
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order " + orderNumber + ": " + dessertName);
    }

}
