package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingMethods {
    public static void main(String arg[]) {
        File filePath = new File("src\\fileHandling\\FileHandlingMethods.java");

        System.out.println("File Name                       : " + filePath.getName());
        System.out.println("Parent                          : " + filePath.getParent());
        System.out.println("The File exists                 : " + filePath.exists());
        System.out.println("This file object is a directory : " + filePath.isDirectory());
        System.out.println("This file Object is File        : " + filePath.isFile());
        System.out.println("Tihs file path is absolute      : " + filePath.isAbsolute());
        System.out.println("-----------------------------------------------------------");
        
        System.out.println("Can the file Execute            : " + filePath.canExecute());
        System.out.println("Can read the file               : " + filePath.canRead());
        System.out.println("Can write in the File           : " + filePath.canWrite());
        System.out.println("-----------------------------------------------------------");
        
        System.out.println("Get Path                        : " + filePath.getPath());
        System.out.println("get absolute Path               : " + filePath.getAbsolutePath());
        try {
            System.out.println("Get canonical Path              : " + filePath.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Get URI Path                    : " + filePath.toURI());
        System.out.println("-----------------------------------------------------------");
    }
}
