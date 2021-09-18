package lab1;

import java.util.Arrays;
import java.util.Objects;

public class Taxi implements Car {
    private Driver[] driver;
    private String vin;

    public Driver[] getDriver() {
        return driver;
    }

    public void setDriver(final Driver[] driver) {
        this.driver = driver;
    }

    @Override
    public String getVin() {
        return vin;
    }

    public void setVin(final String vin) {
        this.vin = vin;
    }

    public Taxi(final Driver[] driver, final String vin) {
        setDriver(driver);
        setVin(vin);
    }

    @Override
    public String toString() {
        return "Taxi {" +
                "Drivers " + Arrays.toString(getDriver()) +
                ", VIN: '" + getVin() + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Taxi taxi = (Taxi) o;
        return Arrays.equals(driver, taxi.driver) && Objects.equals(vin, taxi.vin);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(vin);
        result = 31 * result + Arrays.hashCode(driver);
        return result;
    }
}
