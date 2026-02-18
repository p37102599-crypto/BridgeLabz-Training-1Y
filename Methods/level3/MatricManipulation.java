package com.gla.Methods.level3;
public class MatricManipulation {

    // a. Create random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10) + 1; // 1 to 10
            }
        }
        return matrix;
    }

    // b. Transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];

        return trans;
    }

    // c. Determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // d. Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // e. Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // f. Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // g. Display matrix
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Inverse does not exist (Determinant = 0)");
            return;
        }
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        double[][] matrix2x2 = createRandomMatrix(2, 2);
        double[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2x2));

        System.out.println("\nDeterminant (2x2): " + determinant2x2(matrix2x2));

        System.out.println("\nInverse (2x2):");
        displayMatrix(inverse2x2(matrix2x2));

        System.out.println("\n--------------------------------");

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix3x3));

        System.out.println("\nDeterminant (3x3): " + determinant3x3(matrix3x3));

        System.out.println("\nInverse (3x3):");
        displayMatrix(inverse3x3(matrix3x3));
    }
}