package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String arg[]) {
        String julius_path = "src/filehandling/Julius.txt";
        try (FileWriter bookWriter = new FileWriter(julius_path)) {
            bookWriter.write("Even you, Brutus?");
            bookWriter.append("\nYes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
