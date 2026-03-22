package com.gla.ExceptionHandling;

import java.util.Scanner;

public class FinallyExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Performing division
            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Cannot divide by zero");

        } finally {
            // This block always executes
            System.out.println("Operation completed");
        }

        sc.close();
    }
}