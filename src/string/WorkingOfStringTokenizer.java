package string;

import java.util.*;
public class WorkingOfStringTokenizer {

    public static void main(String arg[]) {
        String quote = "May,the,force,be,with,you";

        System.out.println("Using StringTokenizer: ");
        StringTokenizer stringTokenizer = new StringTokenizer(quote, ",");
        System.out.println("Number of elements: " + stringTokenizer.countTokens());
        while(stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("--------------------------------");
        System.out.println("Using String's split function: ");
        String[] quoteWords = quote.split(",");
        System.out.println("Number of elements : " + quoteWords.length);
        for(String quoteWord : quoteWords) {
            System.out.println(quoteWord);
        }
    }
}
