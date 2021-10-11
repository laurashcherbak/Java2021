package lab2.task2;

//import lab2.task2.Stack;
//import lab2.task2.Node;
import java.util.Iterator;

public class IterableStack<T> extends Stack implements Iterable<T> {
        public IterableStack(final Node<T> top) {
            super(top);
        }

        @Override
        public Iterator<T> iterator() {
            return new StackIterator();
        }


}
