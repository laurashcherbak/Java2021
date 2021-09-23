package lab1;

import static lab1.Utils.print;

public class Task2 {
    public static void task2() {
        System.out.println("Task 2");

        final String[] arrayStrings = {"str1", "str2", "str3"};
        final char searchChar = 't';

        System.out.print("arrayStrings[] = ");
        print(arrayStrings);

        System.out.printf("Count of symbols '%s' in arrayStrings[] = %d%n",
                searchChar, count(arrayStrings, searchChar));

        System.out.println();
    }

    public static int count(final String[] arrayStrings, final char searchChar) {
        int count = 0;
        for (final String x: arrayStrings)
            //for (int i = 0; i < x.length(); i++)
            for (final char i : x.toCharArray())
                //if (x.charAt(i) == searchChar)
                if (searchChar == i)
                    count++;
        return count;
    }
}
