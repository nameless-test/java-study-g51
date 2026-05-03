package task9;

public class Main {

    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        manager.addOrder(new CoffeeOrder("Small"));
        manager.addOrder(new CoffeeOrder("Large"));
        manager.addOrder(new TeaOrder("White"));
        manager.addOrder(new DessertOrder("Tiramisu"));

        System.out.println("****************************************************************************************");
        System.out.println(manager.getOrderTypeCounts());
        System.out.println("****************************************************************************************");

    }
}
