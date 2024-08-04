package streams;

import java.util.stream.IntStream;

public class StreamsRange {

    public static void main(String[] args) {

        System.out.println("Temperature Scale from 10 to 30 : ");
        IntStream.rangeClosed(10, 30)
            .filter(number -> number % 2 == 0)
            .forEach(System.out::println);

        System.out.println("Possiblity of rain : ");
        IntStream.range(1, 10).asDoubleStream()
            .map(number -> number/10)
            .forEach(System.out::println);
    }
}
