import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {

    private int id;
    private String name;
    private int age;
    private double score;


    public Student(int id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public double getScore() {
        return score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}



public class Main {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Phuc", 21, 8.5));
        students.add(new Student(1, "An", 20, 9.0));
        students.add(new Student(5, "Binh", 22, 7.5));
        students.add(new Student(2, "Duy", 21, 9.0));


        System.out.println("Danh sách ban đầu:");

        students.forEach(System.out::println);



        // ======================================
        // 1. Sort theo điểm tăng dần
        // ======================================

        students.sort(
                Comparator.comparing(Student::getScore)
        );


        System.out.println("\nSort điểm tăng dần:");

        students.forEach(System.out::println);



        // ======================================
        // 2. Sort theo điểm giảm dần
        // ======================================

        students.sort(
                Comparator
                        .comparing(Student::getScore)
                        .reversed()
        );


        System.out.println("\nSort điểm giảm dần:");

        for(Student s : students ){
            System.out.println(s);
        }



        // ======================================
        // 3. Sort theo tên A-Z
        // ======================================

        students.sort(
                Comparator.comparing(Student::getName)
        );


        System.out.println("\nSort tên A-Z:");

        students.forEach(System.out::println);



        // ======================================
        // 4. Sort nhiều điều kiện
        // Điểm giảm dần
        // Nếu điểm bằng nhau -> tên A-Z
        // ======================================

        students.sort(
                Comparator
                        .comparing(Student::getScore)
                        .reversed()
                        .thenComparing(Student::getName)
        );


        System.out.println("\nSort điểm giảm + tên A-Z:");

        students.forEach(System.out::println);


    }
}