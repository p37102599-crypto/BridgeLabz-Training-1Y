package com.gla.Methods.level2;
import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    // Method using formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check whether the number is a Natural number
        if (n < 1) {
            System.out.println("Please enter a natural number (n ≥ 1).");
        } else {
            int sumRecursion = recursiveSum(n);
            int sumFormula = formulaSum(n);

            // Display results
            System.out.println("Sum using recursion: " + sumRecursion);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumRecursion == sumFormula) {
                System.out.println("Result is correct. Both computations match.");
            } else {
                System.out.println("Result is incorrect. Computations do not match.");
            }
        }

        sc.close();
    }
}