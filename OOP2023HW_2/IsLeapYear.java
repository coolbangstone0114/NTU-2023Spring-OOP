/**
 * The IsLeapYear class is used to determine if a given year is a leap year.
 * A leap year is defined as any year that is divisible by 4, unless it is divisible by 100.
 * However, years that are divisible by 400 are also leap years.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class IsLeapYear {

    /**
     * Determines if a given year is a leap year.
     *
     * @param test_year the year to test
     * @return true if the given year is a leap year, false otherwise
     */
    public static boolean determine(int test_year) {
        // Set default return value to true
        boolean result = true;

        // Check if the year is divisible by 400
        if (test_year % 400 == 0) {
            return result;
        }
        // Check if the year is divisible by 4 but not by 100
        else if (test_year % 4 == 0 && test_year % 100 != 0) {
            return result;
        }
        // If the year is not divisible by 400, 4, or 100, it is not a leap year
        else {
            return !result;
        }
    }
}
