package com.gla.Methods.level3;
public class FootballTeamHeight {

    // b. Generate random heights between 150 cm and 250 cm
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            // Random height in range 150–250
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    // c. Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // d. Method to find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // e. Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // f. Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    // g. Main method
    public static void main(String[] args) {

        int[] heights = generateHeights();

        System.out.println("Heights of football players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n\nShortest height: " + findShortest(heights) + " cm");
        System.out.println("Tallest height: " + findTallest(heights) + " cm");
        System.out.println("Mean height: " + findMean(heights) + " cm");
    }
}