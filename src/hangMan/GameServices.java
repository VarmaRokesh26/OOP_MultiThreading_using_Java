package hangMan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GameServices {

    private static String filePath = "src\\hangMan\\words.txt";

    public void start() throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        String randomWord = getRandomWord();
        char[] randomWordArray = randomWord.toCharArray();
        int numberOfChances = randomWord.length();
        char[] guessingWordArray = new char[numberOfChances];

        Arrays.fill(guessingWordArray, '_');

        System.out.println("Starting the Game Get Ready with your Guesses :)");
        System.out.println("The length of the word and the number of chances you have is : " + numberOfChances);
        System.out.println("The word" + new String(guessingWordArray));
        // System.out.println(randomWord);

        while(true) {
            System.out.println("--------------------------------------");
            System.out.print("Please type in a letter : ");
            char letter = scanner.next().toLowerCase().charAt(0);
            boolean isGuessingCorrect = false;
            
            for (int i = 0; i < randomWordArray.length; i++) {
                if(letter == randomWordArray[i]) {
                    guessingWordArray[i] = letter;
                    isGuessingCorrect = true;
                }
            }

            if(isGuessingCorrect) {
                System.out.println("It's a good Guess");
                if(isGameFinished(guessingWordArray)) {
                    break;
                }
            } else {
                numberOfChances--;
                if(numberOfChances == 0) {
                    System.out.println("Sorry buddy you ran out of chances");
                    System.out.println("Better luck next Time");
                    System.out.println("The word is : " + randomWord);
                    break;
                }

                System.out.println("The Number of Chances is reduced to : " + numberOfChances);
                System.out.println("Try another Letter");
            }
            
            System.out.println("The word : " + new String(guessingWordArray));
        }

        scanner.close();
    }
    
    private boolean isGameFinished(char[] guessingWordArray) {
        for(int i=0;i<guessingWordArray.length;i++) {
            if(guessingWordArray[i] == '_') {
                return false;
            }
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Congratulations You Won");
        System.out.println("The word is : " + new String(guessingWordArray));
        return true;
    }

    private static String getRandomWord() throws FileNotFoundException{
        List<String> words = getTheWords();
        Random wordIndex = new Random();
        int indexOfWord = wordIndex.nextInt(words.size());

        return words.get(indexOfWord);
    }

    private static List<String> getTheWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        Scanner wordsScanner = new Scanner(new File(filePath));

        while(wordsScanner.hasNextLine()) {
            words.add(wordsScanner.nextLine());
        }

        wordsScanner.close();
        return words;
    }
}
