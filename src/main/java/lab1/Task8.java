package lab1;

public class Task8 {
    public static void task8() {
        System.out.println("Task 8");

        final CustomDouble number1 = new CustomDouble(1, 5.9);
        final CustomDouble number2 = new CustomDouble(2, 7.3);

        System.out.println("Number1 = " + number1.toDouble());
        System.out.println("Number2 = " + number2.toDouble());

        System.out.println("Sum: number1 + number2 = " + number1.sum(number2).toDouble());
        System.out.println("Difference: number2 - number1 = " + number2.diff(number1).toDouble());

        System.out.print("Compare: ");
        final int t = number1.compareTo(number2);
        if (t >= 1) {
            System.out.println("number 1 > number2");
        } else if (t <= -1) {
            System.out.println("number 1 < number2");
        } else {
            System.out.println("number 1 = number2");
        }

        System.out.println("Equals (number1 and number2) : " + number1.equals(number2));
        System.out.println("HashCode number1: " + number1.hashCode());
        System.out.println("HashCode number2: " + number2.hashCode());

        System.out.println();
    }
}
