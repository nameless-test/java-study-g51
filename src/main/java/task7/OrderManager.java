package task7;

public class OrderManager {

    public double calculateTotal(Order[] orders) {
        double sumOfOrders = 0;
        for (Order n : orders) {
            if ("NEW".equals(n.getOrderStatus()) || "COMPLETED".equals(n.getOrderStatus())) {
                double price = n.getPrice();
                sumOfOrders = sumOfOrders + price;
            }
        }
        System.out.print("Total sum: ");
        return sumOfOrders;
    }
}
