package lab1;

import java.util.Objects;

public class Driver {
    private String driverName;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(final String driverName) {
        this.driverName = driverName;
    }

    public Driver(final String driverName) {
        setDriverName(driverName);
    }

    @Override
    public String toString() {
        return "{" +
                " Driver: '" + getDriverName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Driver driver = (Driver) o;
        return Objects.equals(driverName, driver.driverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverName);
    }
}
