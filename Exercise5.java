/**
 * Class:Exercise5
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.3.
 * @written on:10/6/2023
 * Course:ITEC 2140-13 Saturday
 * This class prompts the user for an integer value. The program should then calculate and print the factorial of the user provided value.
 * */
package Hw4P1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer to calculate its factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            String factorialExpression = "";

            for (int i = n; i > 0; i--) {
                factorial *= i;

                if (i == n) {
                    factorialExpression += i;
                } else {
                    factorialExpression += " * " + i;
                }
            }

            System.out.println(n + "! = " + factorialExpression + " = " + factorial);
        }

        scanner.close();
    }
}
