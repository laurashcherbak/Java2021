package lab2.task2;

//import lab2.task2.Node;
import java.util.Iterator;

public class StackIterator<T> extends Stack implements Iterator<T> {
        Node<T> next = top;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public T next() {
            final T value = next.getValue();
            next = next.getNext();
            return value;
        }
}
