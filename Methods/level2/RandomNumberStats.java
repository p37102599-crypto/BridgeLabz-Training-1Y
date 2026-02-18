package com.gla.Methods.level2;
public class RandomNumberStats {

    // a. Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random 4-digit number (1000–9999)
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // b. Method to find average, min and max
    // returns double[] {average, min, max}
    public double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        RandomNumberStats obj = new RandomNumberStats();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Find average, min and max
        double[] result = obj.findAverageMinMax(randomNumbers);

        System.out.println("\n\nAverage value: " + result[0]);
        System.out.println("Minimum value: " + (int) result[1]);
        System.out.println("Maximum value: " + (int) result[2]);
    }
}
