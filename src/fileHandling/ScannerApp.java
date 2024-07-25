package fileHandling;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String arg[]) {
        String path = "src\\fileHandling\\sample.txt";

        try(Scanner sc = new Scanner(new File(path))) {
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch(FileNotFoundException fe) {
            fe.printStackTrace();
        }
    }
}
