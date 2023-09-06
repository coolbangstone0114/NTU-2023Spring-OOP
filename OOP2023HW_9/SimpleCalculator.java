import java.util.Arrays;
import java.util.List;

/**
 * A class representing a simple calculator that performs basic arithmetic operations.
 * The calculator supports addition, subtraction, multiplication, and division.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class SimpleCalculator {
    private double result;
    private int count;
    private List<Character> valid_operator = Arrays.asList('+', '-', '*', '/'); // valid operators
    private char current_operator; // last operator used
    private double current_target_number; // last operand used
    private boolean calc_end = false; // flag to indicate if the calculator has ended

    /**
     * Constructs a SimpleCalculator object with an initial result of 0.00 and a count of 0.
     */
    public SimpleCalculator() {
        this.result = 0.00;
        this.count = 0;
    }

    /**
     * Returns a string representation of the calculator status and result.
     *
     * @return a message indicating the calculator status and result
     */
    public String getMsg() {
        String output_result = String.format("%.2f", this.result);
        String output_target = String.format("%.2f", this.current_target_number);

        if (count == 0 && !calc_end) {
            return "Calculator is on. Result = 0.00";
        } else if (count == 1 && !calc_end) {
            return "Result " + this.current_operator + " " + output_target + " = " + output_result + ". New result = " + output_result;
        } else if (count > 1 && !calc_end) {
            return "Result " + this.current_operator + " " + output_target + " = " + output_result + ". Updated result = " + output_result;
        } else
            return "Final result = " + output_result;
    }

    /**
     * Ends the calculator session if the user enters the "r" command.
     *
     * @param cmd the user command
     * @return true if the calculator session has ended, false otherwise
     */
    public boolean endCalc(String cmd) {
        if (cmd.length() == 1 && cmd.equalsIgnoreCase("r")) {
            this.calc_end = true;
            return true;
        }
        return false;
    }

    /**
     * This method calculates the result based on the input command.
     * The command should contain 1 operator and 1 value separated by 1 space.
     * Supported operators are +, -, *, and /.
     *
     * @param cmd the input command to calculate the result
     * @throws UnknownCmdException when the input command is invalid or contains unknown operator/value
     */
    public void calResult(String cmd) throws UnknownCmdException {
        if (!cmd.contains(" ") || cmd.split(" ").length != 2) { // check if input format is valid
            throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
        }

        String[] operate_set = cmd.split(" "); // separate operator and target number
        boolean operator_fit = true;
        if (!valid_operator.contains(cmd.charAt(0))) { // check if operator is valid
            operator_fit = false;
        }

        try {
            Double.parseDouble(operate_set[operate_set.length - 1]); // check if value is valid
            if (!operator_fit) { // if only operator is invalid
                throw new UnknownCmdException(cmd.charAt(0) + " is an unknown operator");
            }
        } catch (NumberFormatException e) {
            if (!operator_fit) { // check if both operator and value are invalid
                throw new UnknownCmdException(operate_set[0] + " is an unknown operator and " + operate_set[operate_set.length - 1] + " is an unknown value");
            } else { // if only value is invalid
                throw new UnknownCmdException(operate_set[operate_set.length - 1] + " is an unknown value");
            }
        }

        char operator = operate_set[0].charAt(0);
        double target_number = Double.parseDouble(operate_set[operate_set.length - 1]);
        if (target_number == 0) { // check if value is 0 to avoid arithmetic error
            throw new UnknownCmdException("Can not divide by 0");
        }

        // apply operation to the result
        switch (operator) {
            case '+':
                this.result += target_number;
                break;
            case '-':
                this.result -= target_number;
                break;
            case '*':
                this.result *= target_number;
                break;
            case '/':
                this.result /= target_number;
                break;
        }
        this.current_operator = operator; // track the current operator
        this.current_target_number = target_number; // track the current target number
        count++; // increase operation count
    }
}
