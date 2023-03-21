package homework_week_7;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Program19ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {6, 7, 2, 5, 1};
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // Calculate the average value
        double average = (double) sum / numbers.length;

        System.out.println("Average of array elements: " + average);
    }
}

