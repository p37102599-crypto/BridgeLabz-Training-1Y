package com.gla.Methods.level2;
import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and return them in an array
    public static int[] findFactors(int num) {
        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array with count
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double sumOfSquares(int[] factors) {
        double sumSq = 0;
        for (int f : factors) {
            sumSq += Math.pow(f, 2);
        }
        return sumSq;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        // Display factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println();
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        sc.close();
    }
}