package funtionalProgramming.builtInFuntionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaBiFunction {

    public static void main(String arg[]) {
        BiFunction<Integer, Integer, Double>  getpow = (number1, number2) -> Math.pow(number1, number2);
    
        System.out.println(getpow.apply(5, 2));

        BiFunction<Integer, Integer, List<Integer>> generateList = (size, number) -> {
            List<Integer> generatedList = new ArrayList<>();
            for(int i=0;i<size;i++) {
                generatedList.add(i * number);
            }

            return generatedList;
        };

        System.out.println(generateList.apply(10, 100));
    }
}
