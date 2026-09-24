package level6_TRY_WITH_RESOURCES;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class bai16_ {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("data/students/students.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)){

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
