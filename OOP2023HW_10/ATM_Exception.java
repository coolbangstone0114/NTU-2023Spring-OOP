/**
 * The ATM_Exception class is a custom exception that extends Exception class and is used to handle ATM related exceptions.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class ATM_Exception extends Exception {
    private ExceptionTYPE exceptionCondition;

    /**
     * The ExceptionTYPE is an enumerated type used to define two different types of exceptions.
     */
    public enum ExceptionTYPE {
        BALANCE_NOT_ENOUGH, // When the balance in the account is not sufficient for withdrawal.
        AMOUNT_INVALID // When the amount to be withdrawn is not a multiple of 1000.
    }

    /**
     * Constructor of ATM_Exception class.
     *
     * @param exceptionCondition The type of exception occurred.
     */
    public ATM_Exception(ExceptionTYPE exceptionCondition) {
        this.exceptionCondition = exceptionCondition;
    }

    /**
     * Overrides the getMessage method of the Exception class.
     *
     * @return A string message describing the exception occurred.
     */
    @Override
    public String getMessage() {
        String message;
        switch (this.exceptionCondition) {
            case BALANCE_NOT_ENOUGH:
                message = "BALANCE_NOT_ENOUGH";
                break;
            case AMOUNT_INVALID:
                message = "AMOUNT_INVALID";
                break;
            default:
                message = "An unexpected error has occurred.";
        }
        return message;
    }
}
