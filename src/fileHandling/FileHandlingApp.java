package fileHandling;

import java.io.*;
public class FileHandlingApp {
    public static void main(String[] args) {
        File quoteFile = new File("src\\fileHandling\\quote.txt");

        try {
            if(quoteFile.createNewFile()) {
                System.out.println("File is Created");
            }
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
