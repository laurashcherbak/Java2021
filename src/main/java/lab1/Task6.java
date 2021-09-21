package lab1;

import static lab1.Utils.print;

public class Task6 {
    public Task6() {
        System.out.println("Task 6");

        System.out.println("Creating and filling matrix...");

        final int[][] matrixA = {{2, 1}, {-1, 0}, {0, 4}};
        final int[][] matrixB = {{5, -1, 3, 2}, {4, 9, 0, 1}};
        final int[][] matrixC;

        System.out.println("Printing matrixA...");
        print(matrixA);
        System.out.println("Printing matrixB...");
        print(matrixB);

        System.out.println("MatrixA * MatrixB ...");
        matrixC = mulMatrix(matrixA, matrixB);

        System.out.println("Printing matrixC...");
        print(matrixC);
        System.out.println();

    }



    public int[][] mulMatrix(final int[][] matrixA, final int[][] matrixB) {
        //Matrix multiplication
        //For matrix multiplication, the number of columns in the first matrix must be equal
        // to the number of rows in the second matrix.
        // The result matrix has the number of rows of the first
        // and the number of columns of the second matrix.
        //In mathematics, particularly in linear algebra, matrix multiplication is a binary operation
        // that produces a matrix from two matrices. For matrix multiplication,
        // the number of columns in the first matrix must be equal to the number of rows
        // in the second matrix. The resulting matrix, known as the matrix product,
        // has the number of rows of the first and the number of columns of the second matrix.
        // The product of matrices A and B is denoted as AB.

        final int n = matrixA.length;
        final int m = matrixB[0].length;
        final int[][] mulMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    mulMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return mulMatrix;
    }

}
