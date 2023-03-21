package homework_week_7;
/**Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)

 *
 */
import java.util.Scanner;

public class Program1OddEven {
    public void oddEven(int num){
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        Program1OddEven obj = new Program1OddEven();
        obj.oddEven(num);
        sc.close();

    }
}
