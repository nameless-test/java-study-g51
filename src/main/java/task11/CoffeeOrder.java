package task11;

public class CoffeeOrder extends Order {

    private CoffeeSize coffeeSize;

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + coffeeSize + " coffee" + " - " + getPrice() + " UAH");
    }

    @Override
    public String toString() {
        return "Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + coffeeSize + " coffee" + " - " + getPrice() + " UAH";
    }
    
    public CoffeeOrder(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public void setSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    @Override
    public double getPrice() {
        if (null == coffeeSize) {
            throw new java.lang.Error("Incorrect size. Try: \"SMALL, MEDIUM, LARGE\"");
        } else switch (coffeeSize) {
            case SMALL:
                return 20;
            case MEDIUM:
                return 30;
            case LARGE:
                return 50;
            default:
                throw new java.lang.Error("Incorrect size. Try: \"SMALL, MEDIUM, LARGE\"");
        }
    }

    public CoffeeSize getSize() {
        return coffeeSize;
    }

}
