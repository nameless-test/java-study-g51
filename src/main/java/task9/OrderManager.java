package task9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {

    private static List<Order> ordersList = new java.util.ArrayList<>();

    public static List<Order> getOrdersList() {
        return ordersList;
    }

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

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public void removeOrderByNumber(int orderNumber) {
        boolean removed = ordersList.removeIf(e -> e.getOrderNumber() == orderNumber);

        if (!removed) {
            System.out.println(orderNumber + " is incorrect number for order");
        }
    }

    public Order findOrderByNumber(int orderNumber) {
        for (Order e: ordersList) {
            if (e.getOrderNumber() == orderNumber) {
                return e;
            }
        }
        return null;
    }

    public List<Order> getOrdersByStatus (String status) {
        List<Order> ordersListByStatus = new java.util.ArrayList<>();
        for (Order e: ordersList) {
            if (status.equals(e.getOrderStatus())) {
                ordersListByStatus.add(e);
            }
        }
        return ordersListByStatus;
    }

    public Map<String, Integer> getOrderTypeCounts() {
        Map<String, Integer> ordersCountByType = new HashMap<>(); 

        int coffeeOrdersCount = 0;
        int teaOrdersCount = 0;
        int dessertOrdersCount = 0;

        for (Order n : ordersList) {
            if ("CoffeeOrder".equals(n.getClass().getSimpleName())) {
                coffeeOrdersCount++;
            }
            else if ("TeaOrder".equals(n.getClass().getSimpleName())) {
                teaOrdersCount++;
            }
            else if ("DessertOrder".equals(n.getClass().getSimpleName())) {
                dessertOrdersCount++;
            }
        }

        ordersCountByType.put("CoffeeOrder", coffeeOrdersCount);
        ordersCountByType.put("TeaOrder", teaOrdersCount);
        ordersCountByType.put("DessertOrder", dessertOrdersCount);

        return ordersCountByType;
    }
    
}
