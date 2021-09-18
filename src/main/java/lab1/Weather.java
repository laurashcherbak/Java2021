package lab1;

public class Weather {
    private String weather;

    public String getWeather() {
        return weather;
    }

    public void setWeather(final String weather) {
        this.weather = weather;
    }

    public Weather(final String weather) {
        setWeather(weather);
    }

}

