package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {
    public static void main(String[] args) {
        String filePath = "src\\fileHandling\\sample.txt";

        char arrayofWords[] = new char[10000];
        try (FileReader sampleFile = new FileReader(filePath)) {
            sampleFile.read(arrayofWords);
            System.out.println(arrayofWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
