package lab2.task2;

public class Program {
    public static void main(final String[] args) {

//        final Node<Integer> node1 = new Node<>(1);
//        final Node<Integer> node2 = new Node<>(2);
//        final Node<Integer> node3 = new Node<>(3);

        final Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);


//        for(int i = 0; i < 3; i++) {
//            System.out.println(stack.pop());
//        }

        for(final Integer x : stack) {
            System.out.println(x);
        }

    }
}
