package lab1;

import java.util.Objects;

public class Order {
    private Taxi taxi;
    private int numOrder;

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(final Taxi taxi) {
        this.taxi = taxi;
    }

    public int getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(final int numOrder) {
        this.numOrder = numOrder;
    }

    public Order(final Taxi taxi, final int numOrder) {
        setTaxi(taxi);
        setNumOrder(numOrder);
    }

    @Override
    public String toString() {
        return "Order {" +
                getTaxi() +
                ", Order #: " + getNumOrder() +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Order order = (Order) o;
        return numOrder == order.numOrder && Objects.equals(taxi, order.taxi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxi, numOrder);
    }
}
