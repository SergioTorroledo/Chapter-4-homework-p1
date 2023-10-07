/**
 * Class:Exercise2
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.2.
 * @written on:10/4/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays a prompts the user for student grades, calculates and displays the average grade in the class
 * */

package Hw4P1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGrades = 0;
        int count = 0;
        while (true) {
            System.out.println("Students grade and average grades ");
            if (scanner.hasNextInt()) {
                int grade = scanner.nextInt();
                totalGrades += grade;
                count++;

            } else {
                String input = scanner.next();
                if (input.equals("c")) {
                    break;
                } else {
                    System.out.println("Invalid input.Please enter a valid grade ");
                }

            }
        }
    if(count==0){
        System.out.println("No grades entered.");}
    else {
        double avarage = (double) totalGrades/count;
        System.out.println("Average student grade is " + avarage);
    }
    scanner.close();
    }
}
