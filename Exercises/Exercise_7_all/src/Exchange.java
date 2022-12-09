import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exchange {
    //generic method to swap the position of elements in a list
    public static final <T> void swap (T[] a, int first, int second) {
        // Store the element at index first in a temporary variable
        T t = a[first];
        // Replace the element at index first with the element at index second
        a[first] = a[second];
        // Replace the element at index second with the element from the temporary
        a[second] = t;
    }
    public static final <T> void swap (List<T> l, int first, int second) {
        Collections.<T>swap(l, first, second);
    }
    private static void test() {
        // Create a string
        String [] original = {"Sukruth", "Mothakapally"};
        swap(original, 0, 1);
        System.out.println("original : "+ Arrays.toString(original));

        //calling the generic method to get the swapped elements
        List<String> swapped = new ArrayList<String>(Arrays.asList(original));
        // Exchange the positions of the first and second words in the string
        swap(swapped, 0, 1);
        System.out.println("swapped : "+swapped);
    }
    public static void main(String...args)
    {
        test();
    }
}