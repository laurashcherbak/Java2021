package lab1;

import java.util.Objects;

public class Order {
    private Taxi taxi;
    private int numOrder;
    private User client;

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

    public User getClient() {
        return client;
    }

    public void setClient(final User client) {
        this.client = client;
    }

    public Order(final Taxi taxi, final int numOrder, final User client) {
        setTaxi(taxi);
        setNumOrder(numOrder);
        setClient(client);
    }

    @Override
    public String toString() {
        return "Order{" +
                getTaxi() +
                ", Order #: " + getNumOrder() +
                ", Client :" + getClient() +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Order order = (Order) o;
        return numOrder == order.numOrder && Objects.equals(taxi, order.taxi) && Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxi, numOrder, client);
    }
}
