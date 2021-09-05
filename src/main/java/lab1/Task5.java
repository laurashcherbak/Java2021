package lab1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task 5");

        System.out.println("Creating and filling matrix...");

//        //Initialization matrix
//        final int n = 2;
//        final int m = 3;
//        int[][] matrix = new int[n][m];
//        for(int i = 0; i < n; i++)
//            for(int j = 0; j < m; j++)
//                matrix[i][j] = (int)(Math.abs(Math.random()));

        int[][] matrix = {{1, 3, 5}, {2, 4, 6}};
        final int n = matrix.length;
        final int m = matrix[0].length;
        int[][] transposedMatrix = new int[m][n];

        System.out.println("Printing matrix...");
        printMatrix(matrix);

        System.out.println("Transposing Matrix ...");
        transposedMatrix = transposeMatrix(matrix);

//        //Exception for transposing matrix n X n
//        for(int i = 0; i < n; i++) {
//            for(int j = i + 1; j < n; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }

        System.out.println("Printing transposedMatrix...");
        printMatrix(transposedMatrix);

    }

    public static void printMatrix(int[][] matrix) {
        final int n = matrix.length;
        final int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        final int n = matrix.length;
        final int m = matrix[0].length;
        int[][] transposedMatrix = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

}
