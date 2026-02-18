package com.gla.Methods.level1;
import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum of n natural numbers using loop
    static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calling method
        int result = findSum(n);

        // Display output
        System.out.println("The sum of first " + n + " natural numbers is " + result);

        sc.close();
    }
}