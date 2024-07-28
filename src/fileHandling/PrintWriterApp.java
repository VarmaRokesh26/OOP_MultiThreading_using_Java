package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {
    public static void main(String arg[]) {
        String path = "src/fileHandling/Julius.txt";
        try(PrintWriter bookWriter =  new PrintWriter(new FileWriter(path, true))) {
            bookWriter.println("I wanted this!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
