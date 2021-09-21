package lab1;

public class Matrix {
    private final int[][] matrix;

    public Matrix(final int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] transposeMatrix() {
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
