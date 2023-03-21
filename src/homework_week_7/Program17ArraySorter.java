package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program17ArraySorter {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};
        String[] strings = {"apple", "orange", "banana", "pear", "grape"};

        // Sorting the numeric array
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // Sorting the string array
        Arrays.sort(strings);
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}

