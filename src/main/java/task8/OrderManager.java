package task8;

import java.util.List;

public class OrderManager {

    private static List<Order> ordersList = new java.util.ArrayList<>();

    public double calculateTotal(List<Order> orders) {
        double sumOfOrders = 0;
        for (Order n : orders) {
            if ("NEW".equals(n.getOrderStatus())) { 
                double price = n.getPrice();
                sumOfOrders = sumOfOrders + price;
            }
        }
        System.out.print("Total sum: ");
        return sumOfOrders;
    }

    void addOrder(Order order) {
        ordersList.add(order);
    }

    void removeOrderByNumber(int orderNumber) {
        boolean removed = ordersList.removeIf(e -> e.getOrderNumber() == orderNumber);

        if (!removed) {
            System.out.println(orderNumber + " is incorrect number for order");
        }
    }

    Order findOrderByNumber(int orderNumber) {
        for (Order e: ordersList) {
            if (e.getOrderNumber() == orderNumber) {
                return e;
            }
        }
        return null;
    }

    List<Order> getOrdersByStatus (String status) {
        List<Order> ordersListByStatus = new java.util.ArrayList<>();
        for (Order e: ordersList) {
            if (status.equals(e.getOrderStatus())) {
                ordersListByStatus.add(e);
            }
        }
        return ordersListByStatus;
    }

    public static List<Order> getOrdersList() {
        return ordersList;
    }
}
