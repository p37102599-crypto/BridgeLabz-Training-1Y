package com.gla.Methods.level3;
public class MatrixOperations {

    // a. Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // 0 to 9
            }
        }
        return matrix;
    }

    // b. Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // c. Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // d. Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Utility method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        int[][] matrixA = createRandomMatrix(2, 3);
        int[][] matrixB = createRandomMatrix(2, 3);
        int[][] matrixC = createRandomMatrix(3, 2);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("\nMatrix C:");
        displayMatrix(matrixC);

        System.out.println("\nMultiplication (A × C):");
        displayMatrix(multiplyMatrices(matrixA, matrixC));
    }
}