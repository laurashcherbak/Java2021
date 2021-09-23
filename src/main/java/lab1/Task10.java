package lab1;

public class Task10{
    public static void task10() {
        System.out.println("Task 10");
        System.out.println("Weather for the week:");

        final Day[] week = {Day.Monday("Sunny"),
               Day.Tuesday("Cloudy"),
               Day.Wednesday("Cloudy"),
               Day.Thursday("Rainy"),
               Day.Friday("Cloudy"),
               Day.Saturday("Rainy"),
               Day.Sunday("Sunny")
        };

        int i = 1;
        for(final Day x: week) {
           System.out.println("Day " + (i++) + x);
        }

        System.out.println();

    }
}
