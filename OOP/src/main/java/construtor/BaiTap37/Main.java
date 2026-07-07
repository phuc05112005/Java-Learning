package construtor.BaiTap37;

public class Main {
    public static void main(String[] args) {
        Lop l1 = new Lop("CNPM","Cong nghe thong tin");
        Lop l2 = new Lop("QLDD", "Quan ly dat dai");

        NgaySinh ngay1 = new NgaySinh(5,11,2005);
        NgaySinh ngay2 = new NgaySinh(16,11,2005);

        SinhVien sv1 = new SinhVien(12345,"Le Hoang Phuc",ngay1, 8.0,l1);
        SinhVien sv2 = new SinhVien(67899,"Le Hong Duc",ngay2,4.8,l2);

        System.out.println(sv1.inTenKhoa());
        System.out.println(sv1.kiemTraDau());
        System.out.println(sv1.kiemTraNgaySinh(sv2));
    }
}
