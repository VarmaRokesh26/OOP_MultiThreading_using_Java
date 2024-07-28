package hangMan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GameServices {
    public void start() throws FileNotFoundException{
        String randomWord = getRandomWord();
        char[] randomWordArray = randomWord.toCharArray();
        int numberOfChances = randomWord.length();
        char[] guessingWordArray = new char[numberOfChances];

        Arrays.fill(guessingWordArray, '_');

        System.out.println("Starting the Game Get Ready with your Guesses :)");
        System.out.println("The length of the word and the number of chances you have is : " + numberOfChances);
        System.out.println("the word" + new String(guessingWordArray));

        // System.out.println(randomWord);
    }

    private static String getRandomWord() throws FileNotFoundException{
        List<String> words = getTheWords();
        Random wordIndex = new Random();
        int indexOfWord = wordIndex.nextInt(words.size());

        return words.get(indexOfWord);
    }

    private static List<String> getTheWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        Scanner wordsScanner = new Scanner(new File("src\\hangMan\\words.txt"));

        while(wordsScanner.hasNextLine()) {
            words.add(wordsScanner.nextLine());
        }

        wordsScanner.close();
        return words;
    }
}
