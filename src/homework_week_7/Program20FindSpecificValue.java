package homework_week_7;

/**
 * Write a Java program to test if an array contains a specific value.
 */

public class Program20FindSpecificValue {
    public static void main(String[] args) {
        int[] userInput = {5, 2, 7, 1, 8};
        int specificElement = 7;
        Program20FindSpecificValue.getSpecificElement(userInput, specificElement);
    }
    public static void getSpecificElement(int[] userInput, int specificElement) {

        int[] input = userInput;
        int element = specificElement;

        for (int i = 0; i < input.length; i++) {
            //System.out.println("" + input[i]);

            if (input[i] == element) {
                System.out.println("YES");
            }
        }
    }
}

