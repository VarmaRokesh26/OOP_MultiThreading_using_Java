package streams;

import java.util.List;
import java.util.stream.Collectors;

import streams.ExampleDataDefinition.Item;

public class StreamsPeek {

    public static void main(String[] args) {
        List<Item> fruitBoxes = List.of(
                new Item("strawberry", 10, 7.99),
                new Item("blueberry", 20, 26.99),
                new Item("pear", 10, 28.99),
                new Item("apple", 10, 3.99),
                new Item("kiwi", 10, 11.99),
                new Item("pear", 20, 9.99),
                new Item("strawberry", 20, 19.99),
                new Item("apple", 10, 15.99),
                new Item("apple", 10, 4.99)
        );

        List<Item> filteredFruitBoxes = fruitBoxes.stream()
                .filter(fruitBox -> fruitBox.getQuantity() > 10)
                .peek(fruitBox -> System.out.println("Quantity filtered :" + fruitBox))
                .peek(fruitBox -> fruitBox.setPrice(fruitBox.getPrice() + 5))
                .filter(fruitBox -> fruitBox.getPrice() < 20)
                .peek(fruitBox -> System.out.println("Price filtered : " + fruitBox))
                .collect(Collectors.toList());
        
        System.out.println("Filtered Fruit Box : ");
        filteredFruitBoxes.stream().forEach(System.out::println);
    }
}
