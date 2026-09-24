package level8_duyetthumuc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class bai22_Fileswalk {
    public static void main(String[] args) {
        Path path = Path.of("data");

        // In toan bo folder va file
        try(Stream<Path> paths = Files.walk(path)) {
            paths
                    // Chi in file co duoi .txt
                    //.filter(p -> p.getFileName().toString().endsWith(".txt"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }



        // Dem tong folder
        try(Stream<Path> paths = Files.walk(path)){
            long count = paths
                    .filter(Files::isDirectory)
                    .count();
            System.out.println("Tong so folder: " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Dem tong file
        try(Stream<Path> paths = Files.walk(path)){
            long count = paths
                    .filter(Files::isRegularFile)
                    .count();
            System.out.println("Tong so file: " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Dem so file .txt
        try(Stream<Path> paths = Files.walk(path)){
            long count = paths
                    .filter(p -> p.getFileName().toString().endsWith(".txt"))
                    .count();
            System.out.println("Tong so file .txt: " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
