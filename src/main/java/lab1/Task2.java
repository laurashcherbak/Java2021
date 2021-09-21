package lab1;

import static lab1.Utils.print;

public class Task2 {
    public Task2() {
        System.out.println("Task 2");

        final String[] arrayStrings = {"str1", "str2", "str3"};

        System.out.print("arrayStrings[] = ");
        print(arrayStrings);

        int count = 0;
        final char searchChar = 't';
        for (final String x: arrayStrings)
            //for (int i = 0; i < x.length(); i++)
            for (final char i : x.toCharArray())
                //if (x.charAt(i) == searchChar)
                if (searchChar == i)
                    count++;

        System.out.printf("Count of symbols '%s' in arrayStrings[] = %d%n", searchChar, count);

        System.out.println();
    }
}
