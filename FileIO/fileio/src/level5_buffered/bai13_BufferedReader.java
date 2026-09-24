package level5_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class bai13_BufferedReader {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("data/students/students.txt");

        BufferedReader reader = Files.newBufferedReader(file);

        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
