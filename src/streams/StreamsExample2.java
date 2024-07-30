package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample2 {
    public static void main(String[] args) {
        List<Integer> temperatures = List.of(16, 19, 16, 17, 19, 19, 16);

        System.out.println("List of temperatures less than 16                      : " + temperatures.stream()
                .filter(temperature -> temperature > 16)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));

        System.out.println("Count of the temperature less than 16                  : " + temperatures.stream()
                .filter(temperature -> temperature > 16)
                .count());

        System.out.println("List of temperatures greater than 16 && lesser than 19 : "+temperatures.stream().
                filter(temperature -> temperature > 16 && temperature < 19)
                .collect(Collectors.toList()));
    }
}
