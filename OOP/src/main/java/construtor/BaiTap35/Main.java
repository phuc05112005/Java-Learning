package construtor.BaiTap35;

public class Main {
    public static void main(String[] args) {
        Ngay ngaySinh1 = new Ngay(5,11,2005);
        Ngay ngaySinh2 = new Ngay(16,6,2003);

        TacGia tacGia1 = new TacGia("Le Hoang Phuc", ngaySinh1);
        TacGia tacGia2 = new TacGia("Le Hong Duc", ngaySinh2);


        Sach s1 = new Sach("Tri tue nhan tao", 200000, 2020,tacGia1);
        Sach s2 = new Sach("Cong nghe java", 150000,2021,tacGia2);

        s1.inTenSach();

        
        System.out.println(s1.kiemTra(s2));
        System.out.println(s1);
        System.out.println("Gia sau khi giam la: " + s1.giaGiam(10));
    }


}
