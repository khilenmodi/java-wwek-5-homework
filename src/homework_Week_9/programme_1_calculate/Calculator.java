package homework_Week_9.programme_1_calculate;

/**
 * Created by jay Vaghani
 *write a java program using the following descriptions
 * creat one package with name calculate
 * create two class with name "Calculator" and "homework_week_9. calculator.main"
 * create four methods with names "addition", "subtraction", "division", and "Multiplication".
 * All methods are instance method and it does not return anything.
 * But it has two parameters with name "int a" and "int b".
 * Each method have system.out.println(). this prints the result.
 * also creat all one more method with name "calculateResult"with three parameter with name int a, int b, and char symbol.
 * Write the logic in calculateResult method that when user enter first numberand second number
 * and symbol based on symbol it does calculate.
 * Write a main method into main class it has scanner that takes user input
 * Also write the logic that it ask user to "enter first number :","Enter second Number :"
 * "Please Enter on of the Symbol +, -, /, *:" if user enter +symbol result like "Addition of 5 and 10 is :15" and respective
 * for other symbol.
 * 5] with the result it is also print one more message "would you like to do more calculation please enter "Y" or "N" :"
 */

public class Calculator {

    // method to calculate addition
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + "and" + b + "is :" + (a + b));
    }

    // method to calculate subtraction
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + "and" + b + "is :" + (a - b));
    }

    // method to calculate Division
    public void division(int a, int b) {
        System.out.println("Division of " + a + "and" + b + "is :" + (a / b));
    }

    // method to calculate Multiplication
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + "and" + b + "is :" + (a * b));
    }

    // Method to calculate a result
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else {
            System.out.println("Invalid input !!!");
        }
    }
}
