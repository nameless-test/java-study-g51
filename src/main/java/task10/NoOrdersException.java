package task10;

public class NoOrdersException extends RuntimeException {

    public NoOrdersException () {
        super("The list is empty. Can not to count SUM.");
    }
}
