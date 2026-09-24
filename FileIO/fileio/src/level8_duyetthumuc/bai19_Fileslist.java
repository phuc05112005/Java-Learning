package level8_duyetthumuc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class bai19_Fileslist {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("data");

        try(Stream<Path> paths = Files.list(path)){
            paths
                    // Chi in file
                    .filter(Files::isRegularFile)
                    // Chi in file .txt
                    .filter(p -> p.getFileName().toString().endsWith(".txt"))
                    .forEach(p -> System.out.println(p.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
