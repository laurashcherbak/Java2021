package lab1;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Task 2");

        String[] arrayStrings = {"str1", "str2", "str3"};

        System.out.print("arrayStrings[] = [");
        for (int i = 0; i < arrayStrings.length - 1; i++)
            System.out.print(arrayStrings[i] + ", ");
        System.out.print(arrayStrings[arrayStrings.length - 1]);
        System.out.println("]");

        int count = 0;
        char searchChar = 't';
        for (String x: arrayStrings)
            for (int i = 0; i < x.length(); i++)
                if (x.charAt(i) == searchChar)
                    count++;

        System.out.printf("Count of symbols '%s' in arrayStrings[] = %d%n", searchChar, count);

        System.out.println(" ");
    }
}
