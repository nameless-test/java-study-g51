package task10;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        manager.addOrder(new CoffeeOrder("Small"));
        manager.addOrder(new CoffeeOrder("Large"));
        manager.addOrder(new TeaOrder("White"));
        manager.addOrder(new DessertOrder("Tiramisu"));


        try {
            manager.removeOrderByNumber(156165165);
        } catch (OrderNotFoundException e) {
            System.out.println(e);
        }
        
        try {
            manager.findOrderByNumber(4145);
        } catch (OrderNotFoundException e) {
            System.out.println(e);
        }

        try {
            manager.findOrderByNumber(1001).setOrderStatus("aaaaaa");
        } catch (InvalidOrderStatusException e) {
            System.out.println(e);
        }

        final List<Order> testOrders = new java.util.ArrayList<>();

        try {
            manager.calculateTotal(testOrders);
        } catch (NoOrdersException e) {
            System.out.println(e);
        }
        

    }
}
