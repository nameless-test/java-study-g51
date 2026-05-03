package task6;

public class Main {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Order[] orders = new Order[]{
            new CoffeeOrder(126, "Small"),
            new CoffeeOrder(127, "Large"),
            new TeaOrder(133, "Black"),
            new DessertOrder(202, "Cake"),};
        for (Order n : orders) {
            n.printOrderInfo();
        }
        System.out.println("Total price: " + manager.calculateTotal(orders));
    }
}
