package level4_writefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Bai 10. writeString()
        Path file = Path.of("data/bai10.txt");

        Files.createFile(file);
        String content = "Java\n" +
                "Spring Boot\n" +
                "MySQL\n" +
                "Docker";
        Files.writeString(file, content);
        String readFile = Files.readString(file);
        System.out.println(readFile);


        // Bai 11. Ghi List
        Path file2 = Path.of("data/bai11.txt");
        Files.createFile(file2);

        List<String> list = List.of("Java","C#", "Python","SQL");
        Files.write(file2, list);
        List<String> readFile2 = Files.readAllLines(file2);
        System.out.println(readFile2);


        // Bai 12. Append
        Path file3 = Path.of("data/bai12.txt");
        if (Files.notExists(file3)) {
            String content3 = "Application started\n";
            Files.writeString(file3, content3);
        }
        String login = "User logged in\n";
        Files.writeString(file3, login, StandardOpenOption.APPEND);
        String readFile3 = Files.readString(file3);
        System.out.println(readFile3);

    }
}
