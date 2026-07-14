public class Student {
    private String ten;
    private int tuoi;


    public Student(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Name: " + this.ten + ", age: " + this.tuoi;
    }
}
