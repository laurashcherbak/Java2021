package lab2.task1;

public class Cat extends Animal {
    // 1.3
    public static int c = 10;

    // 7.1
    public String name = "Cat: name";

    // 2.3
    static {
        System.out.println("Cat: static block");
    }

    // 7.2
    {
        System.out.println("Cat: non-static block");
    }

    // 8.1
    public Cat() {
        //неявно викликається батьківський конструктор
        System.out.println("Cat: public static int a = " + a);
        System.out.println("Cat: public static int b = " + b);
        System.out.println("Cat: public static int c = " + c);
    }
}
