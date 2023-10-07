/**
 * Class:Exercise3
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.3.
 * @written on:10/6/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays a prompts the user for student grades, calculates and displays the highest and lowest grades in the class.
 * */
package Hw4P1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;

        boolean gradesEntered = false;

        while (true) {
            System.out.print("Enter a grade or 'c' to stop: ");
            if (scanner.hasNextInt()) {
                int grade = scanner.nextInt();


                if (grade > highestGrade) {
                    highestGrade = grade;
                }
                if (grade < lowestGrade) {
                    lowestGrade = grade;
                }

                gradesEntered = true; //
            } else {
                String input = scanner.next();
                if (input.equals("c")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid grade or 'c' to stop.");
                }
            }
        }

        if (!gradesEntered) {
            System.out.println("No grades entered.");
        } else {
            System.out.println("Highest student grade is " + highestGrade);
            System.out.println("Lowest student grade is " + lowestGrade);
        }

        scanner.close();
    }
}

