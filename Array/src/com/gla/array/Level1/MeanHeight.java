package com.gla.array.Level1;
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Create array of size 11
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");

        // Take input
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // c. Find sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // d. Calculate mean
        double mean = sum / heights.length;

        // Print result
        System.out.println("\nMean height of the football team = " + mean);

        sc.close();
    }
}