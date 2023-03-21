package homework_week_7;
/**
 *Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program8CityName {
   public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Alphabet from A to F");
        char ch = s.next().charAt(0);

        if (ch == 'A'){
            System.out.println("city name is Amsterdam");
        }else if (ch == 'B') {
            System.out.println("city name is Berlin");
        }else if (ch == 'c') {
            System.out.println("city name is Cardiff");
        }else if (ch == 'D') {
            System.out.println("city name is Dublin");
        }else if (ch == 'E') {
            System.out.println("city name is Edinburgh");
        }else if (ch == 'F') {
            System.out.println("city name is Feltham");
        }else{
            System.out.println("Invalid entry");
        }
        s.close();

    }
}
