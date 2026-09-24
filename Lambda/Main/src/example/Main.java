package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("An", 18, 8.5));
        students.add(new Student("Bình", 20, 6.8));
        students.add(new Student("Cường", 19, 9.1));
        students.add(new Student("Dũng", 22, 5.7));
        students.add(new Student("Hà", 21, 7.4));

        students.stream()
                .filter(student -> student.getGpa()>=8)
                .forEach(System.out::println);


        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);



        students.forEach(
                student -> System.out.println(student.getGpa() + 0.5)
        );



        students.sort(
                (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa())
        );
        students.forEach(System.out::println);

        System.out.println("====");
        students.sort(
                Comparator.comparing(Student::getGpa).reversed());
        students.forEach(System.out::println);
    }


}