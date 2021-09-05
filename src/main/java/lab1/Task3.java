package lab1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task 3");

        int[] arrayInt = {1, 8, 8, 7, 2};
        char[] arrayChar = {'e', 't', 'c', 'b'};

        System.out.print("int[] = [");
        for (int i = 0; i < arrayInt.length - 1; i++)
            System.out.print(arrayInt[i] + ", ");
        System.out.print(arrayInt[arrayInt.length - 1]);
        System.out.println("]");

        System.out.print("char[] = [");
        for (int i = 0; i < arrayChar.length - 1; i++)
            System.out.print(arrayChar[i] + ", ");
        System.out.print(arrayChar[arrayChar.length - 1]);
        System.out.println("]");

        String string = "";
        int length = (arrayInt.length > arrayChar.length) ? arrayInt.length : arrayChar.length;
        int i = 0;

        while (i <= length) {
            if (i < arrayInt.length)
                string += arrayInt[i];
            if (i < arrayChar.length)
                string += arrayChar[i];
            i++;
        }

        System.out.println("Printing int[] and char[] arrays into single String...");
        System.out.println(string);

        System.out.println(" ");

    }
}
