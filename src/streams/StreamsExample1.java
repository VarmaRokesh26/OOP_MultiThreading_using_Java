package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> outputNumbers = inputNumbers
                .stream()
                .map(number -> number * number)
                .filter(value -> value > 3)
                .collect(Collectors.toList());

        System.out.println(outputNumbers);
    }
}
