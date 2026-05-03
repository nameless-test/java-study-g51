package task11;

public class InvalidOrderStatusException extends RuntimeException{
    private final String status;

    public InvalidOrderStatusException (String status) {
        super("Status " + status + " is incorrect status");
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
}
