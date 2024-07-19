package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// import java.util.stream.Collectors;

public class BufferReaderApp {
    public static void main(String[] args) {
        //BufferReader's size is 8Kb by default

        String path = "src\\fileHandling\\sample.txt";
        try(FileReader sampleFile = new FileReader(path)) {
            BufferedReader  reader = new BufferedReader(sampleFile, 16384);

            // the below method will prints the content in the 
            // files with loop appending with the StringBuilder 
            readAllLines(reader);

            // Here by collecting the lines from the file using 
            // the reader.lines().collect(Collectors.joining(System.lineSeperator()))
            // which is efficient then the previous way of printing the method
            // String sampleFileValues = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            // System.out.println(sampleFileValues);

            // After closes the stream it will throw an IOException which says
            // stream is closed
            // readAllLines(reader);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAllLines(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line ;

        while((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }
}
