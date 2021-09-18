package lab1;

public class Task10{
    public Task10() {
        System.out.println("Task 10");
        System.out.println("Weather for the week:");

        final Day[] week = {new Monday("Sunny"),
               new Tuesday("Cloudy"),
               new Wednesday("Cloudy"),
               new Thursday("Rainy"),
               new Friday("Cloudy"),
               new Saturday("Rainy"),
               new Sunday("Sunny"),
        };

        int i = 1;
        for(final Day x: week) {
           System.out.println("Day " + (i++) + x);
        }

        System.out.println();

    }
}
