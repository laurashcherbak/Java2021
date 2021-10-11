package lab2.task2;

public class Node<T> {
    private T value;
    private Node<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(final T data) {
        this.value = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(final Node<T> next) {
        this.next = next;
    }

    public Node(final T value) {
        setValue(value);
    }

}
