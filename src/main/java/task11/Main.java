package task11;

public class Main {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        manager.addOrder(new CoffeeOrder(CoffeeSize.SMALL));
        manager.addOrder(new CoffeeOrder(CoffeeSize.LARGE));
        manager.addOrder(new TeaOrder(TeaType.HERBAL));
        manager.addOrder(new DessertOrder("Tiramisu"));

        manager.findOrderByNumber(1002).setOrderStatus(OrderStatus.CANCELED);

        System.out.println(manager.findOrderByNumber(1001));
        System.out.println(manager.findOrderByNumber(1002));
        System.out.println(manager.findOrderByNumber(1003));

    }
}
