package level3_readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        // Bai 7. readString()
        Path studentsDir = Path.of("data/students");
        Path studentsFile = studentsDir.resolve("students.txt");

        String conntent = Files.readString(studentsFile);
        System.out.println(conntent);

        // Bai 8. readAllLines()
        List<String> lines = Files.readAllLines(studentsFile);
        for(String line : lines){
            String[] parts = line.split(",");

            String name = parts[0];
            String score = parts[1];

            System.out.println(name + " - " + score);
        }

        // Bai 9. Tinh va in ra
        // Số sinh viên:
        //GPA cao nhất:
        //GPA thấp nhất:
        //GPA trung bình:

        long Count = lines.stream()
                .count();
        System.out.println("So luong hoc sinh co trong file: " + Count);

        //
        double maxScore = lines.stream()
                .mapToDouble(line -> Double.parseDouble(line.split(",")[1]))
                .max()
                .orElse(0.0);
        System.out.println("Diem cao nhat: " + maxScore);

        //
        double minScore = lines.stream()
                .mapToDouble(line -> Double.parseDouble(line.split(",")[1]))
                .min()
                .orElse(0.0);
        System.out.println("Diem thap nhat: " + minScore);

        //
        double avgScore = lines.stream()
                .mapToDouble(line -> Double.parseDouble(line.split(",")[1]))
                .average()
                .orElse(0.0);
        System.out.println("Diem trung binh: " + avgScore);
    }
}
