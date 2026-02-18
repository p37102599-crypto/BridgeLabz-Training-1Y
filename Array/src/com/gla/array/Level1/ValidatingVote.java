package com.gla.array.Level1;
import java.util.Scanner;
public class ValidatingVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a. Define an array of 10 integer elements
        int[] ages = new int[10];
        // Take user input
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        System.out.println("\nChecking Voting Eligibility:\n");
        // b. Loop through the array and check conditions
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered: " + ages[i]);
            }
            else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }
        sc.close();
    }
}
