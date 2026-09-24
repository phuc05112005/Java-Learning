package basic.bai1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("An", 20, 8.5, "CNTT1"),
                new Student("Bình", 21, 7.2, "CNTT2"),
                new Student("Cường", 19, 9.0, "CNTT1"),
                new Student("Dũng", 22, 4.5, "CNTT3"),
                new Student("Hùng", 20, 6.8, "CNTT2"),
                new Student("Nam", 21, 9.5, "CNTT1"),
                new Student("Phúc", 20, 5.5, "CNTT3"),
                new Student("Khoa", 22, 7.8, "CNTT2"),
                new Student("Long", 19, 3.5, "CNTT3"),
                new Student("Minh", 21, 8.2, "CNTT1")
        );

        System.out.println("Sinh vien GPA >= 8: ");
        students.stream()
                .filter(s -> s.getGpa()>=8)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Sinh vien GPA < 5: ");
        students.stream()
                .filter(s -> s.getGpa() < 5)
                .forEach(System.out::println);

        System.out.println();
        long count = students.stream()
                .filter(s -> s.getGpa() >= 8)
                .count();
        System.out.println("So luong sinh vien GPA >= 8: " + count);

        System.out.println();
        boolean hasPerfectStudent = students.stream()
                .anyMatch(s -> s.getGpa() == 10);
        System.out.println("Co sinh vien GPA = 10? => " + hasPerfectStudent);

        System.out.println();
        boolean allPassed = students.stream()
                .allMatch(s -> s.getGpa() > 5);
        System.out.println("Tat ca sinh vien deu co GPA > 5? => " + allPassed);

        System.out.println();
        boolean noVeryLowGpa = students.stream()
                .noneMatch(s -> s.getGpa() < 3);
        System.out.println("Khong co sinh vien nao co GPA < 3? => " + noVeryLowGpa);
    }
}
