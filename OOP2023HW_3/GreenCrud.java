/**
 * The GreenCrud class is used to calculate the population of a new kind of bacterium called "green crud".
 * It is observed that the green crud population grows every five days, and that it grows in the same manner as the Fibonacci sequence does.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class GreenCrud {

    /**
     * Calculates the population of the green crud after a given number of days, starting from an initial size.
     *
     * @param init_size the initial size of the green crud population
     * @param days      the number of days to simulate the growth of the green crud population
     * @return the population of the green crud after the given number of days
     */
    public static int calPopulation(int init_size, int days) {
        // Create an array to store the population of the green crud at each growth interval
        int arr[] = new int[50];
        // Set the first two elements in the array to be equal to the initial size of the green crud population
        arr[0] = init_size;
        arr[1] = init_size;
        // Calculate the number of growth intervals (minus 1 because the second element in the array remains the same as the first)
        int iter = (int) (days / 5) - 1;

        // Calculate the population of the green crud at each growth interval using the Fibonacci sequence
        for (int i = 0; i < iter; i++) {
            // Each element in the array is equal to the sum of the previous two elements, as in the Fibonacci sequence
            arr[i + 2] = arr[i + 1] + arr[i];
        }
        // Return the population of the green crud after the given number of days (which is the last element in the array)
        return arr[iter + 1];
    }
}
