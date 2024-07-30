package funtionalProgramming.lambda;

import java.util.List;

public class ListLambdaExpressionApp {
    public static void main(String[] args) {
        List<Integer> inputNumber = List.of(1, 2, 3, 4, 5);
        NumberOperationService numberOperationService = new NumberOperationService();
        Operation operation = (value) -> value * value;
        List<Integer> outputNumbers = numberOperationService.executeOperation(inputNumber, operation);

        System.out.println(outputNumbers);
    }
}   
