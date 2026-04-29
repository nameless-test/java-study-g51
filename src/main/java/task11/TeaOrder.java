package task11;

public class TeaOrder extends Order {

    private TeaType teaType;

    @Override
    public double getPrice() {
        if (null == teaType) {
            throw new java.lang.Error("Incorrect type. Try: \"BLACK, GREEN, HERBAL\"");
        } else switch (teaType) {
            case BLACK:
                return 60;
            case GREEN:
                return 70;
            case HERBAL:
                return 80;
            default:
                throw new java.lang.Error("Incorrect type. Try: \"BLACK, GREEN, HERBAL\"");
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

    public TeaOrder(TeaType teaType) {
        this.teaType = teaType;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

}
