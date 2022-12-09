import java.util.List;

public class Maxele {

    // Generic method to find the maximal element in the range [begin, end) of a list
    public static <T extends Comparable<T>> T maxInRange(List<T> list, int begin, int end) {
        // Check for invalid input
        if (list == null || begin < 0 || end > list.size() || begin >= end) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Initialize the maximal element to the first element in the range
        T max = list.get(begin);

        // Iterate over the rest of the elements in the range
        for (int i = begin + 1; i < end; i++) {
            // If the current element is greater than the maximal element, update the maximal element
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        // Return the maximal element
        return max;
    }

    public static void main(String[] args) {
        // Test the method with a few example lists
        List<Integer> intList = List.of(1, 5, 2, 4, 6, 3);
        List<String> stringList = List.of("apple", "banana", "cherry", "orange");

        System.out.println(maxInRange(intList, 1, 5)); // should print 6
        System.out.println(maxInRange(stringList, 2, 4)); // should print "orange"
    }
}

