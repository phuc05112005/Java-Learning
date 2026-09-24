package intermediate.bai4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

        // Lay top 3 sinh vien GPA cao nhat
        students.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .limit(3)
                .forEach(System.out::println);

        // Bo qua 5 sinh vien dau roi lap 3 nguoi tiep theo
        System.out.println();
        students.stream()
                .skip(5)
                .limit(3)
                .forEach(System.out::println);



        // Tim kiem sinh vien dau tien co GPA >= 9
        System.out.println();
        Optional<Student> result = students.stream()
                .filter(s -> s.getGpa() >= 9)
                .findFirst();
        result.ifPresent(System.out::println);

        // Tim sinh vien dau tien ten Phuc
        System.out.println();
        Optional<Student> result2 = students.stream()
                .filter(s -> s.getName().equals("Phúc"))
                .findFirst();
        result2.ifPresent(System.out::println);

        // Tim bat ky sinh vien nao thuoc CNTT4
        System.out.println();
        String result3 = students.stream()
                .filter(s -> s.getClassName().equals("CNTT4"))
                .map(Student::getName)
                .findAny()
                .orElse("Khong tim thay sinh vien thuoc CNTT4");
        System.out.println(result3);

        // Tim sinh vien co GPA cao nhat
        System.out.println();
        Optional<Student> maxGpa = students.stream()
                .max(Comparator.comparing(Student::getGpa));
         maxGpa.ifPresent(System.out::println);

         // Tim sinh vien co GPA thap nhat
        System.out.println();
        Optional<Student> minGpa = students.stream()
                .min(Comparator.comparing(Student::getGpa));
        minGpa.ifPresent(System.out::println);

        // Tim sinh vien lon tuoi nhat
        System.out.println();
        Optional<Student> maxAge = students.stream().max(Comparator.comparing(Student::getAge));
        maxAge.ifPresent(System.out::println);

        // Tim sinh vien nho tuoi nhat
        System.out.println();
        Optional<Student> minAge = students.stream().min(Comparator.comparing(Student::getAge));
        minAge.ifPresent(System.out::println);

        // Tim sinh vien co GPA cao nhat duoi dang double
        System.out.println();
        double maxDoubleGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .max()
                .orElse(0.0);
        System.out.println("GPA cao nhat(double): " + + maxDoubleGpa);
    }
}
