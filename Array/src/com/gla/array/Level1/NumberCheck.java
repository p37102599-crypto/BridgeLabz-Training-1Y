package com.gla.array.Level1;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Define an integer array of 5 elements
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Take user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nChecking Numbers:\n");

        // b & c. Loop through array and check conditions
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            }
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative.");
            }
            else {
                System.out.println(numbers[i] + " is Zero.");
            }
        }

        // d. Compare first and last elements
        System.out.println("\nComparing First and Last Elements:");

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and Last elements are Equal.");
        }
        else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than Last element.");
        }
        else {
            System.out.println("First element is Less than Last element.");
        }

        sc.close();
    }
}