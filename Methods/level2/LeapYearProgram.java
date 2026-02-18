package com.gla.Methods.level2;
import java.util.Scanner;

public class LeapYearProgram {

    // Method to check whether a year is a Leap Year
    public static boolean isLeapYear(int year) {

        // Condition a: Year must be >= 1582
        if (year < 1582) {
            return false;
        }

        // Condition b: Leap year rules
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}