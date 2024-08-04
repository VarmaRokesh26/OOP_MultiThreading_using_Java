package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import streams.ExampleDataDefinition.Item;

public class StreamsSkipLimit {
    
    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
            new Item("apple", 10, 3.99),
            new Item("apple", 10, 4.99),
            new Item("strawberry", 10, 7.99),
            new Item("pear", 10, 9.99),
            new Item("kiwi", 10, 11.99),
            new Item("apple", 10, 15.99),
            new Item("strawberry", 20, 19.99),
            new Item("blueberry", 20, 26.99),
            new Item("pear", 10, 28.99)
        );

        List<Item> top3ExpensiveFruitBoxes = fruitBoxes.stream()
                .sorted(Comparator.comparing(Item::getPrice).reversed())
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());

        System.out.println("Top 4 Most Expensive Items : ");
        top3ExpensiveFruitBoxes.stream()
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");
        List<Item> top3LeastExpensiveFruitBoxes = fruitBoxes.stream()
                .sorted(Comparator.comparing(Item::getPrice))
                .skip(1)
                .limit(4)
                .collect(Collectors.toList());

        System.out.println("Top 4 Least Expensive Items : ");
        top3LeastExpensiveFruitBoxes.stream()
                .forEach(System.out::println);
    }
}
