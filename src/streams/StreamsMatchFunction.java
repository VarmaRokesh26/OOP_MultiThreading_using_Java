package streams;

import java.util.List;

import streams.ExampleDataDefinition.Item;

public class StreamsMatchFunction {

    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
            new Item("strawberry", 10, 7.99),
            new Item("blueberry", 20, 26.99),
            new Item("pear", 10, 28.99),
            new Item("apple", 10, 3.99),
            new Item("kiwi", 10, 11.99),
            new Item("pear", 10, 9.99),
            new Item("strawberry", 20, 19.99),
            new Item("apple", 10, 15.99),
            new Item("apple", 10, 4.99)
        );

        boolean isMoreExpensive = fruitBoxes.stream()
                .allMatch(item -> item.getPrice() > 1);

        System.out.println("All fruit boxes are more expensive than 10$ : " + isMoreExpensive);

        boolean isKiwiAvailable = fruitBoxes.stream()
                .anyMatch(item -> "kiwi".equals(item.getName()));

        System.out.println("Kiwi fruit is available in the fruit boxes : " + isKiwiAvailable);

        boolean isNodeMoreExpensive = fruitBoxes.stream()
                .noneMatch(item -> item.getPrice() > 10);

        System.out.println("None of the fruit Boxes are expensive than 100$ : " + isNodeMoreExpensive);
    }
}
