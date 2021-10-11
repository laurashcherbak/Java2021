package lab2.task1;

public class Animal extends Object {
    // 1.2
    public static int b = 10;

    // 5.1
    public String name = "Animal: name";

    // 2.2
    static {
        System.out.println("Animal: static block");
    }

    // 5.2
    {
        System.out.println("Animal: non-static block");
    }

    // 6.1
    public Animal() {
        //неявно викликається батьківський конструктор
        System.out.println("Animal: public static int a = " + a);
        System.out.println("Animal: public static int b = " + b);
    }
}
