package lab1;

import static lab1.Utils.print;

public class Task5 {
    public Task5() {
        System.out.println("Task 5");

        System.out.println("Creating and filling matrix...");

//        //Initialization matrix
//        final int n = 2;
//        final int m = 3;
//        int[][] matrix = new int[n][m];
//        for(int i = 0; i < n; i++)
//            for(int j = 0; j < m; j++)
//                matrix[i][j] = (int)(Math.abs(Math.random()));

        final int[][] matrix = {{1, 3, 5}, {2, 4, 6}};
        int[][] transposedMatrix;

        System.out.println("Printing matrix...");
        print(matrix);

        System.out.println("Transposing Matrix ...");

        System.out.println("Solution 1: ");
        transposedMatrix = transposeMatrix(matrix);

        System.out.println("Printing transposedMatrix...");
        print(transposedMatrix);

//        //Exception for transposing matrix n X n
//        for(int i = 0; i < n; i++) {
//            for(int j = i + 1; j < n; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }

        System.out.println("Solution 2 (class Matrix): ");
        final Matrix m = new Matrix(matrix);
        transposedMatrix = m.transposeMatrix();

        System.out.println("Printing transposedMatrix...");
        print(transposedMatrix);

        System.out.println();

    }



    public int[][] transposeMatrix(final int[][] matrix) {
        final int n = matrix.length;
        final int m = matrix[0].length;
        final int[][] transposedMatrix = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

}
