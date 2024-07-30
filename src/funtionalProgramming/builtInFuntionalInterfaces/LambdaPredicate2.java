package funtionalProgramming.builtInFuntionalInterfaces;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaPredicate2 {

    public static void main(String[] args) {
        examineNumber(15, number -> number > 7);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                                .filter(number -> number % 2 != 0)
                                .collect(Collectors.toList());

        System.out.println(oddNumbers);
    }

    private static void examineNumber(int number, Predicate<Integer> examination) {
        if(examination.test(number)) {
            System.out.println("The result of the examination of " + number + " is true.");
        }
    }
}
