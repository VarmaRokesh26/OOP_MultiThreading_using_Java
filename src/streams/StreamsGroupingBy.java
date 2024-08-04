package streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import streams.ExampleDataDefinition.Item;

public class StreamsGroupingBy {

    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
                new Item("strawberry", 10, 9.99),
                new Item("blueberry", 20, 29.99),
                new Item("pear", 10, 29.99),
                new Item("apple", 10, 9.99),
                new Item("kiwi", 10, 19.99),
                new Item("pear", 10, 9.99),
                new Item("strawberry", 20, 19.99),
                new Item("apple", 10, 19.99),
                new Item("apple", 10, 9.99)
        );

        Map<Boolean, List<Item>> partitionFruitBoxes = fruitBoxes.stream()
                .collect(Collectors.partitioningBy(fruitBox -> fruitBox.getPrice() > 10));

        System.out.println("Cheaper and more expensive than 10$ : ");
        partitionFruitBoxes.entrySet().stream().forEach(System.out::println);

        Map<String, List<Item>> fruitBoxesGroups = fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item::getName));
        
        System.out.println("Fruitboxes grouped by Type");
        System.out.println(fruitBoxesGroups);
        
        Map<String, Long> fruitBoxesCount = fruitBoxes.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        
        System.out.println("Fruitboxes Count grouped by Type");
        System.out.println(fruitBoxesCount);

        Map<String, Long> fruitBoxesOrdered = new LinkedHashMap<>();
        fruitBoxesCount.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(fruitBox -> fruitBoxesOrdered.put(fruitBox.getKey(), fruitBox.getValue()));
        System.out.println(fruitBoxesOrdered);
    }
}
