package level2_crud_filenfolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        // BaI 3. Tao cau truc thu muc
        Path studentsDir = Path.of("data/students");
        Path productsDir = Path.of("data/products");
        Path backupDir = Path.of("backup");

        Files.createDirectories(studentsDir);
        Files.createDirectories(productsDir);
        Files.createDirectories(backupDir);

        // Bai 4. Tao file
        Path studentsFile  = studentsDir.resolve("students.txt");

        if(Files.notExists(studentsFile)){
            Files.createFile(studentsFile);
            System.out.println("Da tao file");
        } else {
            System.out.println("File da ton tai");
        }

        // Bai 5. Copy + Move
        // copy
        Path fileBackup = studentsDir.resolve("students_backup.txt");
        Files.copy(studentsFile, fileBackup);
        // move
        Path finalFileBackup = backupDir.resolve("students_backup.txt");
        Files.move(fileBackup, finalFileBackup);


        // Bai 6. Delete
        Files.deleteIfExists(finalFileBackup);
        System.out.println("File con ton tai khong? -> " + Files.exists(finalFileBackup));

    }
}
