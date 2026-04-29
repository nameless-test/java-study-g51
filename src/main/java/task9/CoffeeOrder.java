package task9;

public class CoffeeOrder extends Order {

    private String coffeeSize;

    public String getSize() {
        return coffeeSize;
    }

    public void setSize(String coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    @Override
    public double getPrice() {
        if ("Small".equals(coffeeSize)) {
            return 20;
        } else if ("Medium".equals(coffeeSize)) {
            return 30;
        } else if ("Large".equals(coffeeSize)) {
            return 50;
        } else {
            throw new java.lang.Error("Incorrect size. Try: \"Small, Medium, Large\"");
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + coffeeSize + " coffee" + " - " + getPrice() + " UAH");
    }

    @Override
    public String toString() {
        return "Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + coffeeSize + " coffee" + " - " + getPrice() + " UAH";
    }
    
    public CoffeeOrder(String coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

}
