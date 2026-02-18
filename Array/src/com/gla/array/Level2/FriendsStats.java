package com.gla.array.Level2;
import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Arrays to store ages and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            // Age input with validation
            System.out.print("Age: ");
            int ageInput = sc.nextInt();
            if (ageInput <= 0) {
                System.out.println("Invalid age! Enter again.");
                i--;
                continue;
            }
            ages[i] = ageInput;

            // Height input with validation
            System.out.print("Height (in cm): ");
            double heightInput = sc.nextDouble();
            if (heightInput <= 0) {
                System.out.println("Invalid height! Enter again.");
                i--;
                continue;
            }
            heights[i] = heightInput;
        }

        // b. Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // c. Display results
        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}