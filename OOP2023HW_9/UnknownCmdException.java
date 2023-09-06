/**
 * An exception class to represent errors in processing unknown commands.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class UnknownCmdException extends Throwable {

    private String errMessage;

    /**
     * Constructs a new UnknownCmdException with the specified error message.
     *
     * @param errMessage the error message for this exception.
     */
    public UnknownCmdException(String errMessage) {
        this.errMessage = new String(errMessage);
    }

    /**
     * Returns the error message for this exception.
     *
     * @return the error message for this exception.
     */
    public String getMessage() {
        return new String(this.errMessage);
    }
}