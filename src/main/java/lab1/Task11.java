package lab1;

public class Task11 {
    public static void task11() {
        System.out.println("Task 11");
        System.out.println("Taxi System: ");

        final User client1 = new User("Ivan", "Ivanov", 20, "ivanov@email.com");
        final User client2 = new User("Petro", "Ivanov", 20, "ivanov@email.com");

        final Driver[] driver1 = {new Driver("Ivan")};
        final Taxi taxi1 = new Taxi(driver1, "1KLBN52TWXM186109");
        final Order order1 = new Order(taxi1, 1, client1);

        final Driver[] driver2 = {new Driver("Ostap"), new Driver("Dmytro")};
        final Taxi taxi2 = new Taxi(driver2, "1KLBN52TWXM186110");
        final Order order2 = new Order(taxi2, 2, client2);

        System.out.println(order1);
        System.out.println(order2);

        System.out.println();
    }

}
