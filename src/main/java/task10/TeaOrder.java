package task10;

public class TeaOrder extends Order {

    private String teaType;

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public double getPrice() {
        if ("White".equals(teaType)) {
            return 10;
        } else if ("Green".equals(teaType)) {
            return 20;
        } else if ("Black".equals(teaType)) {
            return 30;
        } else {
            throw new java.lang.Error("Incorrect size. Try: \"White, Green, Black\"");
        }
    }

    @Override
    public void printOrderInfo() {
        System.out.println("Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + teaType + " tea" + " - " + getPrice() + " UAH");
    }

    @Override
    public String toString() {
        return "Order #" + getOrderNumber() + " (" + getOrderStatus() + ")" + ": " + teaType + " tea" + " - " + getPrice() + " UAH";
    }

    public TeaOrder(String teaType) {
        this.teaType = teaType;
    }

}
