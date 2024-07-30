package funtionalProgramming.builtInFuntionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class LambdaBiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, Integer>  printAttribute = (text, number) -> System.out.println(text + number);
        printAttribute.accept("Points : $",10);

        BiConsumer<List<Integer>, Integer> multiplyNumbers = (list, number )->{
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) * number);
            }
        };

        List<Integer> numbers = Arrays.asList(5, 4, 3, 2, 1);
        multiplyNumbers.accept(numbers, 5);
        System.out.println(numbers);
    }
}
