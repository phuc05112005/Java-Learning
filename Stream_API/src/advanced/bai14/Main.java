package advanced.bai14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // bai 14. flatMap()
        List<Student> students = List.of(
                new Student("An", List.of("Java", "SQL")),
                new Student("Bình", List.of("Java", "Docker")),
                new Student("Cường", List.of("Python", "SQL"))
        );

        // Lay toan bo skill
        students.stream()
                .map(Student::getSkills)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // Dem skill khac nhau
        long count = students.stream()
                .distinct()
                .count();
        System.out.println("So luong skill: " + count);

        // Tim sinh vien co skill "Java"
        System.out.println();
        students.stream()
                .filter(s -> s.getSkills().contains("Java"))
                .map(Student::getName)
                .forEach(System.out::println);

        // Dem so lan moi skill xuat hien
        Map<String, Long> countSkill = students.stream()
                .map(Student::getSkills)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(countSkill);
    }
}
