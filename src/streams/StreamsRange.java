package streams;

import java.util.stream.IntStream;

public class StreamsRange {

    public static void main(String[] args) {
        IntStream.range(0, 30)
            .forEach(System.out::println);
    }
}
