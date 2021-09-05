package lab1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Task 1");

        System.out.println("Solution 1");
        {
            String[] arrayStrings = {"string 1", "string 1234", "string 123", "String 12345", "String 12"};

            System.out.print("Original Array: [");
            for (int i = 0; i < arrayStrings.length - 1; i++)
                System.out.print(arrayStrings[i] + ", ");
            System.out.print(arrayStrings[arrayStrings.length - 1]);
            System.out.println("]");

            for (int i = 0; i < arrayStrings.length - 1; i++)
                for (int j = i; j >= 0; j--)
                    if (arrayStrings[j].length() > arrayStrings[j + 1].length()) {
                        // Change value arrayStrings[j] between arrayStrings[j+1]
                        String s = arrayStrings[j];
                        arrayStrings[j] = arrayStrings[j + 1];
                        arrayStrings[j + 1] = s;
                    }

            System.out.print("Sorted Array: [");
            for (int i = 0; i < arrayStrings.length - 1; i++)
                System.out.print(arrayStrings[i] + ", ");
            System.out.print(arrayStrings[arrayStrings.length - 1]);
            System.out.println("]");
        }

        System.out.println("Solution 2");
        {
            String[] arrayStrings = {"string 1", "string 1234", "string 123", "String 12345", "String 12"};

            System.out.println("Original Array: " + Arrays.toString(arrayStrings));

            Arrays.sort(arrayStrings, (o1, o2) -> o1.length() - o2.length());

            System.out.println("Sorted Array: " + Arrays.toString(arrayStrings));
        }
        System.out.println(" ");



    }
}
