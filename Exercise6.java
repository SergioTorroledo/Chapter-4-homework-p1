/**
 * Class:Exercise5
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.3.
 * @written on:10/6/2023
 * Course:ITEC 2140-13 Saturday
 * This class accepts an integer from the user and displays the sum of the digits of the provided integer.
 * */

package Hw4P1;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();


        int sumOfDigits = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }


        System.out.println("Sum of digits of " + originalNumber + " is " + sumOfDigits);

        scanner.close();
    }
}
