package funtionalProgramming.builtInFuntionalInterfaces;

import java.util.function.Predicate;

public class LambdaPredicate {

    public static void main(String[] args) {
        Predicate<String> moreThan5Letters = text -> text.length() > 5;
        Predicate<String> startsWith = text -> text.startsWith("Welcome");


        boolean isMoreThan5Letters = moreThan5Letters.test("Welcome");
        System.out.println("The text typed in is longer than 5 letter                           : " + isMoreThan5Letters);

        boolean isStartsWithWelcome = startsWith.test("Welcome");
        System.out.println("The text typed in starts with \"Welcome\"                             : " + isStartsWithWelcome);

        boolean isLessThan5Letters = moreThan5Letters.negate().test("Welcome");
        System.out.println("The text typed in is Lesser than 5 Letter                           : " + isLessThan5Letters);

        boolean isCombined = moreThan5Letters.or(startsWith).test("Welcome");
        System.out.println("The text typed in is longer than 5 letter and starts with \"Welcome\" : " + isCombined);

    }
}
