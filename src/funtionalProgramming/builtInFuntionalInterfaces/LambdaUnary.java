package funtionalProgramming.builtInFuntionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class LambdaUnary {

    public static void main(String arg[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(operatesOnList(numbers, number -> number * 10));

        List<String> letters = Arrays.asList("a", "e", "i", "o", "u");
        System.out.println(operatesOnList(letters, letter -> letter + letter));
    }

    private static <T>List<T> operatesOnList(List<T> list, UnaryOperator<T> operator) {
        List<T> result = new ArrayList<>();
        for(T listElement : list) {
            result.add(operator.apply(listElement));
        }

        return result;
    }
}
