package lab2.task1;

public class Object {
    // 1.1
    public static int a = 10;

    // 2.1
    static {
        System.out.println("Object: static block");
    }

    // 3.1
    {
        name = "";
        System.out.println("Object: non-static block");
    }

    // 3.2
    public String name = "Object: name";

    // 4.1
    public Object() {
        System.out.println("Object: public static int a = " + a);
        System.out.println("Object: public String name = " + name);

    }
}
