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

    public static Day Monday(final String weather)
    {
        return new Day("Monday", weather);
    }

    public static Day Tuesday(final String weather)
    {
        return new Day("Tuesday", weather);
    }

    public static Day Wednesday(final String weather)
    {
        return new Day("Wednesday", weather);
    }

    public static Day Thursday(final String weather)
    {
        return new Day("Thursday", weather);
    }

    public static Day Friday(final String weather)
    {
        return new Day("Friday", weather);
    }

    public static Day Saturday(final String weather)
    {
        return new Day("Saturday", weather);
    }

    public static Day Sunday(final String weather)
    {
        return new Day("Sunday", weather);
    }

    @Override
    public String toString() {
        return " {" +
                "Day of week = '" + getDayName() + '\'' +
                ", Weather = '" + getWeather() +
                "'}";
    }

}
