package lab1;

public class Utils {
    public static void print(final String[] arr) {
        final int size = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[size]);
        System.out.println("]");
    }

    public static void print(final int[] arr) {
        final int size = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[size]);
        System.out.println("]");
    }

    public static void print(final char[] arr) {
        final int size = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[size]);
        System.out.println("]");
    }

    public static void print(final int[][] matrix) {
        final int n = matrix.length;
        final int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
