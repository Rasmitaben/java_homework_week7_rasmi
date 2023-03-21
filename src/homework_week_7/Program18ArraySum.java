package homework_week_7;

/**
 * Write a Java program to sum values of an array.
 */

public class Program18ArraySum {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 9, 3, 6};
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}


