package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDistinct {

    public static void main(String[] args) {

        List<String> fruits = List.of("Apple", "Pineapple", "Watermelon", "Banana", "Kiwi", "Apple", "Kiwi");
        List<String> availableFruits = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        
        System.out.println(availableFruits);

        List<Product> cereals = List.of(
            new Product("Cinnamon Loops", "ABC", 7.59, 4.5),
            new Product("Cinnamon Loops", "ABC", 7.59, 4.5),
            new Product("Lucky Puffs", "Logs", 8.59, 4.6),
            new Product("Lucky Puffs", "Logs", 8.59, 4.6),
            new Product("Barn Flakes", "Old Oat", 5.09, 4.0),
            new Product("Golden Cookies", "ABC", 9.99, 4.8)
        );

        cereals.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
