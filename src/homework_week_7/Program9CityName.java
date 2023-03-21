package homework_week_7;
/**
 * Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class Program9CityName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = s.next().charAt(0);

        switch (alphabet) {
            case 'A':
                System.out.println("Amsterdam");
                break;
            case 'B':
                System.out.println("Berlin");
                break;
            case 'C':
                System.out.println("Cardiff");
                break;
            case 'D':
                System.out.println("Dublin");
                break;
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'F':
                System.out.println("Feltham");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        s.close();

    }
}



