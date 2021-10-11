package lab2.task2;

public class Stack<T> {


    protected Node<T> top;

    public Stack(final Node top) {
        this.top = top;
    }

    public Stack() {
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        return top.getValue();
    }

    public T push(final T value) {
        final Node<T> node = new Node<>(value);
        node.setNext(top);
        top = node;

        return value;
    }

    public T pop() {
        final T value = top.getValue();
        top = top.getNext();
        return value;
    }
}
