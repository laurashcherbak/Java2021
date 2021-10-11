package lab2.task4;

public class Counter {
    public static int counter = 0;

    private Counter(final int counter) {
        this.counter = counter;
    }

    public static Counter createCounter(final int counter){
        return new Counter(counter);
    }


    public static Counter createEmptyCounter(){
        return createCounter(0);
    }
}
