package task10;

import java.util.List;

public class NoOrdersException extends RuntimeException {

    public NoOrdersException (List<Order> orders) {
        super("The list of: " + orders + " is empty. Can not to count SUM.");
    }
}
