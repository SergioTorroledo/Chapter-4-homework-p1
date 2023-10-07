/**
 * Class:Exercise1
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:4.11.1.
 * @written on:10/4/2023
 * Course:ITEC 2140-13 Saturday
 * This class displays an integer if the provided integer is a prime number or not. A prime number is a number that is divisible only by 1 and itself.
 * */
package Hw4P1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if(num <= 1){
            isPrime=false;
        }
        else {
            for (int i = 2; i< num; i++){
                if (num % i==0){
                    isPrime=false;
                    break;

                }
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not prime number.");
        }
        scanner.close();
    }
}
