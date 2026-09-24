package level1_path_file;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("data/students/students.txt");

        System.out.println("File name: " + path.getFileName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Absolute path: "+ path.toAbsolutePath());
        System.out.println("Root: " + path.toAbsolutePath().getRoot());

        // Kiem tra file co ton tai khong
        System.out.println(Files.exists(path));
        System.out.println(Files.notExists(path));

        // Co phai file hay khong
        System.out.println(Files.isRegularFile(path));

        // Co phai thu muc khong
        System.out.println(Files.isDirectory(path));
    }
}