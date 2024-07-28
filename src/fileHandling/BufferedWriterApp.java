package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterApp {
    public static void main(String arg[]) {
        try(BufferedWriter bufferedBook = new BufferedWriter(new FileWriter("src/fileHandling/Julius.txt", true))) {
           bufferedBook.write("Why Brutus?");
           bufferedBook.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
