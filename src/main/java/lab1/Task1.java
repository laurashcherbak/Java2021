package lab1;

import java.util.Arrays;
//import java.util.Comparator;

import static lab1.Utils.print;


public class Task1 {
    public static void task1() {
        System.out.println("Task 1");

        System.out.println("Solution 1");
        {
            final String[] arrayStrings = {"string 1", "string 1234", "string 123", "String 12345", "String 12"};

            System.out.print("Original Array: ");
            print(arrayStrings);

            System.out.print("Sorted Array: ");
            print(sort(arrayStrings));
        }

        System.out.println("Solution 2");
        {
            final String[] arrayStrings = {"string 1", "string 1234", "string 123", "String 12345", "String 12"};

            System.out.println("Original Array: " + Arrays.toString(arrayStrings));

            Arrays.sort(arrayStrings, (o1, o2) -> o1.length() - o2.length());
            //Arrays.sort(arrayStrings, Comparator.comparingInt(String::length));
            //Arrays.sort(arrayStrings, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

            System.out.println("Sorted Array: " + Arrays.toString(arrayStrings));
        }
        System.out.println();

    }

    public static String[] sort(final String[] arrayStrings) {
        for (int i = 0; i < arrayStrings.length - 1; i++)
            for (int j = i; j >= 0; j--)
                if (arrayStrings[j].length() > arrayStrings[j + 1].length()) {
                    // Change value arrayStrings[j] between arrayStrings[j+1]
                    final String temp = arrayStrings[j];
                    arrayStrings[j] = arrayStrings[j + 1];
                    arrayStrings[j + 1] = temp;
                }
        return arrayStrings;
    }

}
