package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyMoveApp {
    public static void main(String[] args) {
        Path original = Paths.get("src/fileHandling/Julius.txt");
        Path destinationPath = Paths.get("src/exceptionHandling/Julius.txt");

        try {
            if(Files.exists(original)) {
                Files.move(original, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            }
            Files.copy(destinationPath, original, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
