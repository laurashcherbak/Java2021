package lab1;

public class Day {
    private String dayName;
    private Weather weather;

    public String getDayName() {
        return this.dayName;
    }

    public void setDayName(final String dayName) {
        this.dayName = dayName;
    }

    public String getWeather() {
        return weather.getWeather();
    }

    public void setWeather(final String weather) {
        this.weather = new Weather(weather);
    }

    public Day(final String dayName, final String weather) {
        setDayName(dayName);
        setWeather(weather);
    }

    @Override
    public String toString() {
        return " {" +
                "Day of week = '" + getDayName() + '\'' +
                ", Weather = '" + getWeather() +
                "'}";
    }

}
