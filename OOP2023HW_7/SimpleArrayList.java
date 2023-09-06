import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * A SimpleArrayList is a class that represents a list of integers. It is similar to an ArrayList in Java.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class SimpleArrayList {
    private Integer arr[];

    /**
     * Creates an empty SimpleArrayList.
     */
    public SimpleArrayList() {
        this.arr = new Integer[0];
    }

    /**
     * Creates a SimpleArrayList with a specified initial capacity.
     *
     * @param size the initial capacity of the SimpleArrayList
     */
    public SimpleArrayList(int size) {
        this.arr = new Integer[size];
        Arrays.fill(this.arr, 0);
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified position in this list, or null if the index is out of range
     */
    public Integer get(int index) {
        if (this.size() == 0 || this.size() <= index)// Check if the index is out of range
            return null;
        return this.arr[index];
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return this.arr.length;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param element the element to be added to this list
     */
    public void add(Integer element) {
        Integer[] temp_arr = Arrays.copyOf(this.arr, this.arr.length + 1);
        temp_arr[arr.length] = element; // Add the new element to the end of the new array
        arr = temp_arr; // Set the new array as the underlying array of this SimpleArrayList
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     *
     * @param index   the index of the element to replace
     * @param element the element to be stored at the specified position
     * @return the element previously at the specified position, or null if the index is out of range
     */
    public Integer set(int index, Integer element) {
        if (this.size() == 0 || this.size() <= index) // Check if the index is out of range
            return null;
        Integer original_element = this.arr[index]; // Store the original element
        this.arr[index] = element; // Replace the original element with the new element
        return original_element; // Return the original element
    }

    /**
     * Removes the element at the specified position in this list.
     *
     * @param index the index of the element to be removed
     * @return true if the element was removed, false otherwise
     */
    public boolean remove(int index) {
        if (this.arr[index] == null) // Check if the element to be removed is null
            return false;
        System.arraycopy(this.arr, index + 1, this.arr, index, this.arr.length - index - 1); // Shift the elements after the element to be removed to the left by one position
        this.arr = Arrays.copyOf(this.arr, this.arr.length - 1); // Create a new array with one less element than the original
        return true;
    }

    /**
     * Removes all the elements from this list.
     */
    public void clear() {
        this.arr = new Integer[0];
    }

    /**
     * This method retains only the elements in this list that are contained in the specified list.
     *
     * @param l the specified list to be compared with
     * @return true if this list changed as a result of the call
     */
    public boolean retainAll(SimpleArrayList l) {
        // Get the underlying array of the specified SimpleArrayList
        Integer[] compare_arr = l.getArr();
        boolean is_changed = false;
        int count = 0;
        // Create a new SimpleArrayList to store the common elements
        SimpleArrayList new_arr = new SimpleArrayList();
        // Loop through the current SimpleArrayList
        for (int i = 0; i < this.arr.length; i++) {
            // Check if the current element is contained in the specified SimpleArrayList
            for (int j = 0; j < compare_arr.length; j++) {
                if (this.arr[i] == compare_arr[j]) {
                    new_arr.add(this.arr[i]);
                    break;
                } else
                    count++;
            }
            // If the current element is not contained in the specified SimpleArrayList,
            // set the flag to true
            if (count == compare_arr.length)
                is_changed = true;
            count = 0;
        }
        // Replace the underlying array of the current SimpleArrayList with the new array
        this.arr = new_arr.getArr();
        return is_changed;
    }

    /**
     * This method returns a copy of the underlying array of this SimpleArrayList.
     *
     * @return a copy of the underlying array of this SimpleArrayList
     */
    public Integer[] getArr() {
        return Arrays.copyOf(this.arr, this.arr.length);
    }
}
