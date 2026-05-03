package task6;

public class OrderManager {

    double calculateTotal(Order[] orders) {
        double sumOfOrders = 0;
        for (Order n : orders) {
            double price = n.getPrice();
            sumOfOrders = sumOfOrders + price;
        }
        return sumOfOrders;
    }
}
