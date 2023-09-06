import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleArrayList {
    private Integer[] arr;
    // Default constructor
    public SimpleArrayList(){
        this.arr = new Integer[0];
    }
    // Constructor set all Integer to zero in the array
    public SimpleArrayList(int size){
        this.arr = new Integer[size];
        Arrays.fill(arr, 0);
    }

    public void add(Integer element) {
    }
    public Integer get(int index) {
    }

    public Integer set(int index, Integer element){
    }
    public boolean remove(int index){
    }
    public void clear(){

    }
    public int size(){

    }
    public boolean retainAll(SimpleArrayList l){
        
    }
}
