package basic.bai1;

public class Student {
    private String name;
    private int age;
    private double gpa;
    private String className;

    public Student(String name, int age, double gpa, String className) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", gpa: " + gpa +
                ", className: '" + className + '\'' +
                '}';
    }
}

