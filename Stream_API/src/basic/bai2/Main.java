package basic.bai2;

import basic.bai1.Student;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<basic.bai1.Student> students = List.of(
                new basic.bai1.Student("An", 20, 8.5, "CNTT1"),
                new basic.bai1.Student("Bình", 21, 7.2, "CNTT2"),
                new basic.bai1.Student("Cường", 19, 9.0, "CNTT1"),
                new basic.bai1.Student("Dũng", 22, 4.5, "CNTT3"),
                new basic.bai1.Student("Hùng", 20, 6.8, "CNTT2"),
                new basic.bai1.Student("Nam", 21, 9.5, "CNTT1"),
                new basic.bai1.Student("Phúc", 20, 5.5, "CNTT3"),
                new basic.bai1.Student("Khoa", 22, 7.8, "CNTT2"),
                new basic.bai1.Student("Long", 19, 3.5, "CNTT3"),
                new Student("Minh", 21, 8.2, "CNTT1")
        );

        // In ten tat ca sinh vien trong danh sach
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println();
        students.stream()
                .forEach(s -> System.out.println(s.getName()));

        // Lay ten sinh vien co GPA >= 8
        System.out.println();
        students.stream()
                .filter(s -> s.getGpa() >= 8)
                .map(Student::getName)
                .forEach(System.out::println);

        // In ten sinh vien thanh in hoa
        System.out.println();
        List<String> upperNames = students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .toList();
        System.out.println("Ten cac sinh vien sau khi in hoa: " +upperNames);

        // Lay do dai ten
        System.out.println();
        students.stream()
                .map(s -> s.getName() + " -> " + s.getName().length())
                .forEach(System.out::println);

        // Danh sach ten sinh vien khong trung nhau
        System.out.println();
        List<String> uniqueNames = students.stream()
                .map(Student::getName)
                .distinct()
                .toList();
        System.out.println(uniqueNames);


        // Sap xep ds sinh vien theo GPA tang dan
        System.out.println();
        students.stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .forEach(System.out::println);

        // Sap xep ds sinh vien theo GPA giam dan
        System.out.println();
        students.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .forEach(System.out::println);

        // Sap xep theo tuoi tang dan
        System.out.println();
        students.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(System.out::println);

        // Sap xep theo ten tu A - Z
        System.out.println();
        students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

        // Sap xep theo tuoi giam dan, neu tuoi bang nhau thi xep GPA tang dan
        System.out.println();
        students.stream()
                .sorted(Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getGpa))
                .forEach(System.out::println);
    }

}
