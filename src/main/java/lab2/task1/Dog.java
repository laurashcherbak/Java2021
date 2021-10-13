package lab2.task1;

public class Dog extends Animal {
    // 1.3
    public static int c = 10;

    // 7.1
    public String name = "Dog: name";

    // 2.3
    static {
        System.out.println("Dog: static block");
    }

    // 7.2
    {
        System.out.println("Dog: non-static block");
    }

    // 8.1
    public Dog() {
        //неявно викликається батьківський конструктор
        System.out.println("Dog: public static int a = " + a);
        System.out.println("Dog: public static int b = " + b);
        System.out.println("Dog: public static int c = " + c);
    }
}
