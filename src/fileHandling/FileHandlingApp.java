package fileHandling;

import java.io.*;
public class FileHandlingApp {
    public static void main(String[] args) {
        String FILE_DIRECTORY = "src\\fileHandling\\";
        File quoteFile = new File(FILE_DIRECTORY + "quote.txt");

        try {
            if(quoteFile.createNewFile()) {
                System.out.println("File is Created");
            }
        } catch(IOException exception) {
            exception.printStackTrace();
        }

        File famousPersonQuotesFile = new File(FILE_DIRECTORY + "famousPersonQuote.txt");
        if(quoteFile.renameTo(famousPersonQuotesFile)) {
            System.out.println("File is Renamed");
        } else {
            System.out.println("File is not Renamed");
        }

        if(famousPersonQuotesFile.delete()) {
            System.out.println("File is Deleted");
        } else {
            System.out.println("File is not Deleted");
        }
    }
}
