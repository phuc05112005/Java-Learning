package level7_FILES.LINES_STREAM;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class bai17_bai18 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("data/students/students.txt");

        // Loc nhung sinh vien co diem >= 8
        System.out.println("Nhung sinh vien co diem >= 8: ");
        try(Stream<String> lines = Files.lines(file)) {
            lines
                    .filter(line -> Double.parseDouble(line.split(",")[1]) >= 8)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Sinh vien co diem cao nhat
        System.out.print("Sinh vien co diem cao nhat: ");
        try(Stream<String> lines = Files.lines(file)){

            Optional<String> maxScore = lines
                    .max(Comparator.comparing(line -> Double.parseDouble(line.split(",")[1])
                    ));
            maxScore.ifPresent(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Tim sinh vien co diem thap nhat
        System.out.print("Sinh vien co diem thap nhat: ");
        try(Stream<String> lines = Files.lines(file)){
            Optional<String> minScore = lines
                    .min(Comparator.comparing(line -> Double.parseDouble(line.split(",")[1])));
            minScore.ifPresent(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Tinh diem trung binh
        try(Stream<String> lines = Files.lines(file)) {
            double avgScore = lines
                    .mapToDouble(line -> Double.parseDouble(line.split(",")[1]))
                    .average()
                    .orElse(0.0);
            System.out.println("Diem trung binh: " + avgScore);
        }

        // Dem so sinh vien co diem >= 8
        try(Stream<String> lines = Files.lines(file)){
            long count = lines
                    .filter(line -> Double.parseDouble(line.split(",")[1])>=8)
                    .count();
            System.out.println("So luong sinh vien co diem >= 8: " + count);
        }
    }
}
