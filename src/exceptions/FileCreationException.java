package exceptions;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationException {

    public static void main(String arg[]) {
        createFile("sample.txt");
    }

    public static void createFile(String fileName) {
        try (PrintWriter outputFile = new PrintWriter(new FileWriter(fileName));) {
            outputFile.println("Rokesh Varma");
        } catch(IOException ioe) {
            System.err.println("Caught an IOException : " + ioe.getMessage());
        }
    }
}
