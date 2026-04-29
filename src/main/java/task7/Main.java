package task7;

public class Main {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Order[] orders = new Order[]{
            new CoffeeOrder("Small"),
            new CoffeeOrder("Large"),
            new TeaOrder("White"),
            new DessertOrder("Tiramisu"), 
            // new CoffeeOrder("Extra Large"),           
            // new TeaOrder("Pink"),            
            // new DessertOrder("Candies"),
        };
        orders[2].setOrderStatus("CANCELED");
        orders[3].setOrderStatus("COMPLETED");

        for (Order n : orders) {
            n.setOrderNumber(n.getOrderNumber());
            n.printOrderInfo();
        }

        System.out.println(manager.calculateTotal(orders));

    }
}
