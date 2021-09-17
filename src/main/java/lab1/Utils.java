package lab1;

public class Utils {
    public static void print(String[] arr) {
        int size = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[size]);
        System.out.println("]");
    }

    public static void print(int[] arr) {
        int size = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[size]);
        System.out.println("]");
    }

    public static void print(char[] arr) {
        int size = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + ", ");
        System.out.print(arr[size]);
        System.out.println("]");
    }
}
