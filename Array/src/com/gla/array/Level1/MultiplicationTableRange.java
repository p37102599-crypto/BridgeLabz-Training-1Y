package com.gla.array.Level1;
import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define array to store results (6 to 9 → 4 values)
        int[] multiplicationResult = new int[4];

        // b. Loop from 6 to 9 and store results
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // c. Display results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:\n");

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
