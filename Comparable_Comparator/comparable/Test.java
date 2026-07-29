package comparable;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(123,"Le Hoang Phuc","CNPM2",8.0);
        SinhVien sv2 = new SinhVien(124,"Nguyen Hong Phuc","CNPM3",4.6);
        SinhVien sv3 = new SinhVien(125,"Le Hong Duc","QLDD",8.8);

        System.out.println(sv1.compareTo(sv3));
        System.out.println(sv1.compareTo(sv2));
    }
}
