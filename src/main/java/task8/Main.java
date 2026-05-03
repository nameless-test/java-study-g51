package task8;

public class Main {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        manager.addOrder(new CoffeeOrder("Small"));
        manager.addOrder(new CoffeeOrder("Large"));
        manager.addOrder(new TeaOrder("White"));
        manager.addOrder(new DessertOrder("Tiramisu"));

        for (Order n : manager.getOrdersList()) {
            n.printOrderInfo();
        }
        System.out.println();

        manager.findOrderByNumber(1001).setOrderStatus("CANCELED");
        System.out.println(manager.findOrderByNumber(1001));
        System.out.println();

        manager.removeOrderByNumber(1003);
        System.out.println(manager.getOrdersList());
        System.out.println();

        System.out.println(manager.findOrderByNumber(1004));
        System.out.println();

        System.out.println(manager.getOrdersByStatus("NEW"));
        System.out.println();

        System.out.println(manager.calculateTotal(manager.getOrdersList()));

    }
}
