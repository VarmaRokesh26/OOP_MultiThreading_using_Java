package streams;

public class WeatherByMonth {

    private String month;
    private int dayTimeTemperature;
    private int nightTimeTemperature;
    
    public WeatherByMonth(String month, int datTImeTemperature, int nightTimeTemperature) {
        this.month = month;
        this.dayTimeTemperature = datTImeTemperature;
        this.nightTimeTemperature = nightTimeTemperature;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDayTimeTemperature() {
        return dayTimeTemperature;
    }

    public void setDayTimeTemperature(int datTImeTemperature) {
        this.dayTimeTemperature = datTImeTemperature;
    }

    public int getNightTimeTemperature() {
        return nightTimeTemperature;
    }

    public void setNightTimeTemperature(int nightTimeTemperature) {
        this.nightTimeTemperature = nightTimeTemperature;
    }

    @Override
    public String toString() {
        return "WeatherByMonth [month=" + month + ", datTImeTemperature=" + dayTimeTemperature
                + ", nightTimeTemperature=" + nightTimeTemperature + "]";
    }
}
