package fileHandling;

import java.io.File;
import java.util.Arrays;

public class DirectoryCreator {
    public static void main(String arg[]) {

        //This part of code is used to create a chain of Directories
        File directoryPath = new File("Ebooks\\Business");

        if(directoryPath.mkdirs()) {
            System.out.println("Directories are Created");
        } else {
            System.out.println("Diretories are not Created");
        }

        directoryPath.deleteOnExit();
        
        //This part is to print the files in the Directory
        File filesInList = new File("src\\fileHandling\\");
        System.out.println("Files in the FileHadling Directory : ");
        System.out.println(Arrays.toString(filesInList.list()));
        System.out.println(Arrays.toString(filesInList.listFiles()));
    }
}
