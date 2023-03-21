package homework_week_7;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 *  * English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
 *  * Input, Marks should between 0 and 100”) and find out total, percentage and result.
 *  * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 *  * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *  _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 *  */


import java.util.Scanner;

public class Program3MarkSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = input.next();
        System.out.println("Enter roll number: ");
        int rollNo = input.nextInt();
        System.out.println("Enter Math marks: ");
        int mathMarks = input.nextInt();
        System.out.println("Enter Science mark");
        int scienceMarks = input.nextInt();
        System.out.println("Enter English marks");
        int englishMarks = input.nextInt();
      input.close();

        // check if marks are valid (between 0 and 100)
        if (mathMarks < 0 || mathMarks > 100 ||
                scienceMarks < 0 || scienceMarks > 100 ||
                englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input.Marks should be between 0 and 100 ");
            return;
        }

        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = (double) total / 3;

        System.out.println("Enter grade");
        String grade = input.next();
        if (percentage >= 80) {
            System.out.println("GradeA+");
        } else if (percentage >= 60) {
            System.out.println("Grade A");
        } else if (percentage >= 50) {
            System.out.println("Grade B");
        } else if (percentage >= 35) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        String result = (percentage >= 35) ? "Pass" : "Fail";

        //Print mark sheet

        System.out.println("|------------------------------------|");
        System.out.println("|             Mark Sheet             |");
        System.out.println("|----------------------------------- |");
        System.out.println("|     Name         :          "+ name + "    |");
        System.out.println("|     Roll No      :"+ rollNo + "                |");
        System.out.println("|------------------------------------|");
        System.out.println("|     Subject      :            Marks|");
        System.out.println("|----------------------------------- |");
        System.out.println("|     Math         :            "+mathMarks+"   |");
        System.out.println("|     Science      :"+scienceMarks+"               |");
        System.out.println("|     English      :"+englishMarks+"               |");
        System.out.println("|------------------------------------|");
        System.out.println("|     Total        :            "+total+"  |");
        System.out.println("|     percentage   :            "+percentage+" |");
        System.out.println("|     Result       :            "+result+" |");
        System.out.println("|     Grade        :            "+grade+"   |");
        System.out.println("|------------------------------------|");
        input.close();
    }
}










