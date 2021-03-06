package lab1;

public class Task7 {
    public static void task7() {
        System.out.println("Task 7");

        final User user1 = new User("Ivan", "Ivanov", 20, "ivanov@email.com");
        final User user2 = new User("Petro", "Ivanov", 20, "ivanov@email.com");
        final User user3 = new User("Petro", "Ivanov", 20, "ivanov@email.com");

        System.out.println("1) " + user1);
        System.out.println("2) " + user2);
        System.out.println("3) " + user3);

        System.out.println("Equals (user1 and user2): " + user1.equals(user2));
        System.out.println("Equals (user3 and user2): " + user3.equals(user2));

        System.out.println("HashCode user1: " + user1.hashCode());
        System.out.println("HashCode user2: " + user2.hashCode());
        System.out.println("HashCode user3: " + user3.hashCode());

        System.out.println();
    }
}
