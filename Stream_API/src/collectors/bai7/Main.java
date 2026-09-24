package collectors.bai7;

import intermediate.bai4.Student;

import java.util.*;
import java.util.stream.Collectors;

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
                new Student("Minh", 21, 8.2, "CNTT1"),
                new Student("Tuấn", 22, 6.5, "CNTT2"),
                new Student("Lan", 20, 9.1, "CNTT1"),
                new Student("Mai", 19, 7.5, "CNTT2"),
                new Student("Hải", 21, 5.9, "CNTT3"),
                new Student("Trang", 22, 8.8, "CNTT1"),
                new Student("Quân", 20, 7.0, "CNTT3"),
                new Student("Vy", 19, 8.6, "CNTT1"),
                new Student("Tùng", 21, 6.4, "CNTT2"),
                new Student("Linh", 22, 9.2, "CNTT1"),
                new Student("Huy", 20, 8.0, "CNTT2")
        );

        // 7. Tong hop diem
        // Tinh tong GPA
        double totalGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .sum();
        System.out.println("Tong GPA: " + totalGpa);

        // Tinh GPA trung binh
        double averageGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
        System.out.println("Gpa trung binh: " + averageGpa);

        // Tim GPA cao nhat
        double maxGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .max()
                .orElse(0.0);
        System.out.println("GPA cao nhat: " + maxGpa);

        // Tim GPA thap nhat
        double minGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .min()
                .orElse(0.0);
        System.out.println("GPA thap nhat: " + minGpa);

        // Dem so sinh vien
        long studentCount = students.stream()
                .count();
        System.out.println("So luong sinh vien: " +  studentCount);

        // Dem so sinh vien co GPA >= 8
        long countGpa8 = students.stream()
                .filter(s -> s.getGpa() >= 8)
                .count();
        System.out.println("So luong sinh vien GPA >= 8: " + countGpa8);



        // 8. Convert du lieu
        // List<Student> → List<String>
        List<String> names = students.stream()
                .map(Student::getName)
                .toList();

        System.out.println(names);


        // List<Student> → Set<String>
        Set<String> uniqueNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.toSet());

        System.out.println(uniqueNames);


        // List<Student> → Map<String, Double>
        Map<String, Double> studentMap = students.stream()
                .collect(Collectors.toMap(
                        Student::getName,
                        Student::getGpa
                ));

        System.out.println(studentMap);



        // 9. joining()
        List<String> skill = List.of(
                "Java",
                "Spring Boot",
                "SQL",
                "Docker",
                "Git"
        );
        String result = skill.stream()
                .collect(Collectors.joining(", ","[","]"));
        System.out.println(result);



        // 10. groupingBy()
        // Nhom sinh vien theo lop
        Map<String, List<Student>> result1 =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getClassName));

        // Den sinh vien moi lop
        Map<String, Long> countStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getClassName, Collectors.counting()));
        System.out.println("So luong sinh vien cac lop: " + countStudents);

        // Tinh GPA trung binh moi lop
        Map<String, Double> averageGpaClass = students.stream()
                .collect(Collectors.groupingBy(Student::getClassName, Collectors.averagingDouble(Student::getGpa)));
        System.out.println("Gpa trung binh moi lop: " + averageGpaClass);

        // Tim GPA cao nhat moi lop
        Map<String, Optional<Student>> bestGpaClass = students.stream()
                .collect(Collectors.groupingBy(Student::getClassName, Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println("GPA cao nhat moi lop: " + bestGpaClass);

        // Danh sach sinh vien theo tung lop
        Map<String, List<String>> namesByClass = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getClassName,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.toList()
                        )
                ));
        System.out.println(namesByClass);
    }
}
