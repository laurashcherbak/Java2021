package lab1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task 4");

        System.out.println("Printing numbers from 1 to 100...");
        for (int i = 0; i < 100; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println(" ");

        System.out.println("Printing numbers from 1 to 100 by conditions from the task 4...");
        for (int i = 1; i <= 100; i++) {
            //Solution 1
            if (!((i % 3 == 0) || (i % 5 == 0)))
                System.out.print(i);
            if (i % 3 == 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            System.out.print(" ");

//                //Solution 2
//                if ((i % 3 == 0) && (i % 5 == 0)) {
//                    System.out.print("FizzBuzz ");
//                } else if (i % 3 == 0) {
//                    System.out.print("Fizz ");
//                } else if (i % 5 == 0) {
//                    System.out.print("Buzz ");
//                } else {
//                    System.out.print(i + " ");
//                }
        }
        System.out.println("\n");

    }
}
