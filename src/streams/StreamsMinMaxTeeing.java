package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMinMaxTeeing {

    public static void main(String[] args) {
        
        List<WeatherByMonth> weatherAverages = List.of(
                new WeatherByMonth("January", 24, 16),
                new WeatherByMonth("February", 24, 16),
                new WeatherByMonth("March", 23, 15),
                new WeatherByMonth("April", 20, 13),
                new WeatherByMonth("May", 18, 10),
                new WeatherByMonth("June", 15, 8),
                new WeatherByMonth("July", 14, 7),
                new WeatherByMonth("August", 15, 8),
                new WeatherByMonth("September", 16, 10),
                new WeatherByMonth("October", 18, 11),
                new WeatherByMonth("November", 20, 12),
                new WeatherByMonth("December", 22, 15)
        );

        WeatherByMonth maxDayTimeTemperature = weatherAverages.stream()
                .max(Comparator.comparing(WeatherByMonth::getDayTimeTemperature)).get();

        System.out.println("The Hottest Month : " + maxDayTimeTemperature.getMonth());
        
        WeatherByMonth minDayTimeTemperature = weatherAverages.stream()
                .collect(Collectors.minBy(Comparator.comparing(WeatherByMonth::getDayTimeTemperature))).get();

        System.out.println("The Coldest Month : " + minDayTimeTemperature.getMonth());

        String weatherAveragesCelsius = weatherAverages.stream()
                .collect(Collectors.teeing(
                    Collectors.maxBy(Comparator.comparingInt(WeatherByMonth::getDayTimeTemperature)),
                    Collectors.minBy(Comparator.comparingInt(WeatherByMonth::getNightTimeTemperature)),
                    (max, min) -> "(" + max.get().getDayTimeTemperature() + "`C, " + min.get().getNightTimeTemperature() + "`C)" 
                ));

        System.out.println("The highest and te coldest temperature " + weatherAveragesCelsius);
    }
}
