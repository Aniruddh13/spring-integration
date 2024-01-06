package ani.spring.integration.exception;

public class OrderFormatDateException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public OrderFormatDateException(String message) {
        super(message);
    }
}
