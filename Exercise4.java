/**
 * Class:Exercise4
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.3.
 * @written on:10/6/2023
 * Course:ITEC 2140-13 Saturday
 * This class prints the first 30 values in the Fibonacci series. A Fibonacci series begins with 0 and 1. The next number is then found by adding the previous two numbers.
 * */
package Hw4P1;

public class Exercise4 {
    public static void main(String[] args) {
        int n = 30;
        long current = 0;
        long previous = 1;
        System.out.print("The first " + n + " Fibonacci numbers are:\n0 1");
        for (int i = 2; i < n; i++) {
            long next = current + previous;
            System.out.print(" " + next);
            previous = current;
            current = next;
        }

        System.out.println();
    }


}
