package com.gla.array.Level2;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numEmployees = 10;

        // b. Define arrays
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        // Variables to calculate totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Take input for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            // Input salary with validation
            System.out.print("Enter salary: ");
            double salaryInput = sc.nextDouble();
            if (salaryInput <= 0) {
                System.out.println("Invalid salary! Enter again.");
                i--; // decrement index to repeat
                continue;
            }

            // Input years of service with validation
            System.out.print("Enter years of service: ");
            double yearsInput = sc.nextDouble();
            if (yearsInput < 0) {
                System.out.println("Invalid years of service! Enter again.");
                i--; // decrement index to repeat
                continue;
            }

            salaries[i] = salaryInput;
            yearsOfService[i] = yearsInput;
        }

        // e. Calculate bonus, new salary, and totals
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // f. Print results
        System.out.println("\nEmployee Details and Bonuses:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salaries[i] +
                    " | Bonus: " + bonuses[i] +
                    " | New Salary: " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
