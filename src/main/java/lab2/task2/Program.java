package lab2.task2;

public class Program {
    public static void main(final String[] args) {

        final Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for(final Integer x : stack) {
            System.out.println(x);
        }

    }
}
