package streams;

import java.util.Collection;
// import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsCollectTo {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "kiwi", "orange", "pineapple", "banana", "papaya", "kiwi", "apple");
        Set<String> available = fruits.stream()
                .filter(fruit -> fruit.startsWith("p"))
                .map(fruit -> fruit.substring(0, 1).toUpperCase() + fruit.substring(1))
                .collect(Collectors.toSet());

        // Set<String> available = new HashSet<>(fruits);
        
        System.out.println(available);

        Collection<String> fruitBoxes = fruits.stream()
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("Fruit Boxes : ");
        System.out.println(fruitBoxes);

        Map<String, String> fruitNamesWithUpperCase = fruits.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), String::toUpperCase));

        System.out.println("Fruits names with UpperCase");
        fruitNamesWithUpperCase.entrySet()
            .stream()
            .forEach(fruit -> System.out.println(fruit.getKey() + " : " + fruit.getValue()));
    }
}
