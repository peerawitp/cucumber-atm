package ku.atm;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {}
    public InsufficientBalanceException(String reason) {
        super(reason);
    }
}
