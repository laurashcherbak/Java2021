package lab1;

import java.util.Arrays;

import static lab1.Utils.print;


public class Task1 {
    public Task1() {
        System.out.println("Task 1");

        System.out.println("Solution 1");
        {
            String[] arrayStrings = {"string 1", "string 1234", "string 123", "String 12345", "String 12"};

            System.out.print("Original Array: ");
            print(arrayStrings);

            for (int i = 0; i < arrayStrings.length - 1; i++)
                for (int j = i; j >= 0; j--)
                    if (arrayStrings[j].length() > arrayStrings[j + 1].length()) {
                        // Change value arrayStrings[j] between arrayStrings[j+1]
                        String temp = arrayStrings[j];
                        arrayStrings[j] = arrayStrings[j + 1];
                        arrayStrings[j + 1] = temp;
                    }

            System.out.print("Sorted Array: ");
            print(arrayStrings);
        }

        System.out.println("Solution 2");
        {
            String[] arrayStrings = {"string 1", "string 1234", "string 123", "String 12345", "String 12"};

            System.out.println("Original Array: " + Arrays.toString(arrayStrings));

            Arrays.sort(arrayStrings, (o1, o2) -> o1.length() - o2.length());
            //TODO: Investigate how works solution with using "Comparator.comparingInt(String::length)"

            System.out.println("Sorted Array: " + Arrays.toString(arrayStrings));
        }
        System.out.println();



    }

}
