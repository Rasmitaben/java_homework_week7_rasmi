package homework_week_7;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Program10Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = s.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = s.next().charAt(0);

        if (operation == '+') {
                System.out.println("Addition of "+ num1 + "+"  + num2 + "= " +(num1+num2));
            } else if (operation == '-') {
                System.out.println("Subtraction of "+ num1 + "-"  + num2 + "=" +(num1-num2));
            } else if (operation == '*') {
                System.out.println("Multiplication of "+ num1 + "*"  + num2 + "=" +(num1+num2));
            } else if (operation == '/') {
                System.out.println("Division of "+ num1 + "/"  + num2 + "= " +(num1+num2));
            } else {
                System.out.println("Invalid operation.");
                return;
            }
               s.close();

    }
}