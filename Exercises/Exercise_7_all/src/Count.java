import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Count {
    public static void main(String[] args) {
        // Create a collection of integers
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print the number of odd integers in the collection
        System.out.println("Number of odd integers : "+countElementsWithProperty(numbers, (Integer i) -> i % 2 == 1));

        // Print the number of prime numbers in the collection
        System.out.println("Number of prime numbers : "+countElementsWithProperty(numbers, (Integer i) -> isPrime(i)));

        // Print the number of palindromes in the collection
        System.out.println("Number of palindromes : "+countElementsWithProperty(numbers, (Integer i) -> isPalindrome(i)));
    }

    // Define a generic method that counts the number of elements in a collection
    // that have a specific property
    public static <T> int countElementsWithProperty(Collection<T> collection, Predicate<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.test(element)) {
                count++;
            }
        }
        return count;
    }

    // Define a method that checks if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Define a method that checks if a number is a palindrome
    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}