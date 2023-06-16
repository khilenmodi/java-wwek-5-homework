 package homework_week9;

import java.util.Scanner;

/**
 * Created by JAY VAGAHANI
 */
/*
   Rewrite the student mark sheet programme using if else and while loop. (week-7 Homework)
 */
public class Programme_2_MarkSheet {
     public static void main(String [] args){
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter student name \t \t:\t"); // input wizard
        String name = scanner.next();
        System.out.println("\nEnter student Roll number \t \t:\t"); // input wizard
        int rollNum = scanner.nextInt();
        System.out.println("\nEnter Marks of subject Maths \t \t:\t"); // input wizard
        int mathMarks = scanner.nextInt();
        while (mathMarks<0 || mathMarks>100){
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of Maths \t \t:\t");
            mathMarks = scanner.nextInt();
        }
        System.out.println("\nEnter Marks of subject science \t \t:\t"); // input wizard
        int scienceMarks = scanner.nextInt();
        while ( scienceMarks<0 || scienceMarks>100){
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of science \t \t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("\nEnter Marks of subject english \t \t:\t"); // input wizard
        int englishMarks = scanner.nextInt();
        while ( englishMarks<0 || englishMarks>100){
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of english  \t \t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total *100)/300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = caculateGrade(percentage, result);
       // printTheMarksheet (name, rollNum, mathMarks,scienceMarks,englishMarks,total,percentage,result,grade);
        // closing the scanner object
        scanner.close();

    }
    // calculating the sum
    public static int sum (int a, int b, int c){
        return a+b+c;
    }
    // calculating the result on subjects marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks){
        if (mathMarks<35 || scienceMarks<35 || englishMarks<35){
            return "FAIL";
        }else
            return "PASS";
    }
    // calculating the grade on percentage and result
    public static String caculateGrade(int percentage, String result){
        String grade = null;
        if (result.equalsIgnoreCase("Pass")){
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        }else {
            grade = "-";
        }
        return grade;
    }
    // printing the mark sheet
    public static void printTheMarksheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result, String grade){
        System.out.println("|----------------------------------------|");
        System.out.println("|             MARK SHEET                 |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Name          : " + name + "           |");
        System.out.println("| Roll No       : " + rollNum + "        |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Subjects      :   Marks                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Math          : " + mathsMarks + "     |");
        System.out.println("| Science       : " + scienceMarks + "   |");
        System.out.println("| English       : " + englishMarks + "   |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Total         : " + total + "          |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Percentage    : " + percentage + "     |");
        System.out.println("| Result    : " + result + "             |");
        System.out.println("| Grade    : " + grade + "               |");
        System.out.println("|----------------------------------------|");
    }

}
