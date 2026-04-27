package task10;

public class DessertOrder extends Order {

    private String dessertName;

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
        if ("Cake".equals(dessertName)) {
            return 100;
        } else if ("Ice-cream".equals(dessertName)) {
            return 150;
        } else if ("Tiramisu".equals(dessertName)) {
            return 200;
        } else {
            throw new java.lang.Error("Incorrect size. Try: \"Cake, Ice-cream, Tiramisu\"");
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + dessertName + " - " + getPrice() + " UAH");
    }

    @Override
    public String toString() {
        return "Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + dessertName + " - " + getPrice() + " UAH";
    }

    public DessertOrder(String dessertName) {
        this.dessertName = dessertName;
    }

}
