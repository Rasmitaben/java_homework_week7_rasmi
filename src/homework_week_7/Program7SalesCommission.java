package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Program7SalesCommission {
    double commissionRate;
    public void salesCommission(int salesId,String sellerName,double salesAmount,double basicSalary){


        if (salesAmount >= 50000) {
            System.out.println("commissionRate is: 0.35");
        } else if (salesAmount >= 30000) {
            System.out.println("commissionRate is: 0.20");
        } else if (salesAmount >= 20000) {
            System.out.println("commissionRate is: 0.10");
        } else if (salesAmount >= 10000) {
            System.out.println("commissionRate is: 0.05");
        } else {
            System.out.println("commissionRate is: 0.02;");
        }

        double commission = salesAmount * commissionRate;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sales Id");
        int salesId = sc.nextInt();

        System.out.print("Enter Seller's Name: ");
        String sellerName = sc.next();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = sc.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Program7SalesCommission obj = new Program7SalesCommission();
        obj.salesCommission(salesId,sellerName,salesAmount,basicSalary);
        sc.close();
    }
}
