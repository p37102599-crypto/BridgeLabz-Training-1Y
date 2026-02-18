package com.gla.Methods.level3;
public class ZaraBonus {

    // b. Method to generate salary and years of service
    // 2D array: [employee][0] = salary, [employee][1] = years of service
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            // 5-digit salary (10000 to 99999)
            data[i][0] = 10000 + (int)(Math.random() * 90000);

            // Years of service (1 to 10)
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

    // c. Method to calculate bonus and new salary
    // 2D array: [employee][0] = new salary, [employee][1] = bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];

            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;   // 5% bonus
            } else {
                bonus = salary * 0.02;   // 2% bonus
            }

            result[i][0] = salary + bonus; // new salary
            result[i][1] = bonus;          // bonus amount
        }
        return result;
    }

    // d. Method to calculate totals and display in tabular format
    public static void displayReport(int[][] data, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int years = data[i][1];
            double bonus = result[i][1];
            double newSalary = result[i][0];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t\t%.2f\t%.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int employees = 10;

        int[][] employeeData = generateEmployeeData(employees);
        double[][] bonusData = calculateBonus(employeeData);
        displayReport(employeeData, bonusData);
    }
}