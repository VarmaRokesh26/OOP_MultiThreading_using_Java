package hangMan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GameServices {
    public void start() {

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
