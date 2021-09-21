package lab1;

import static lab1.Utils.print;

public class Task3 {
    public Task3() {
        System.out.println("Task 3");

        final int[] arrayInt = {1, 8, 8, 7, 2};
        final char[] arrayChar = {'e', 't', 'c', 'b'};

        System.out.print("int[] = ");
        print(arrayInt);

        System.out.print("char[] = ");
        print(arrayChar);

        String string = "";
        final int length = (arrayInt.length > arrayChar.length) ? arrayInt.length : arrayChar.length;
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

        System.out.println();

    }
}
