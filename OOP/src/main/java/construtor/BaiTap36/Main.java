package construtor.BaiTap36;

public class Main {
    public static void main(String[] args) {
        NgayChieu ngay1 = new NgayChieu(20,12,2026);
        NgayChieu ngay2 = new NgayChieu(5,8,2026);

        HangSanXuat hangA = new HangSanXuat("ABC","USA");
        HangSanXuat hangB = new HangSanXuat("XYC","VietNam");

        Phim phim1 = new Phim("Nguoi trong ao ho", 2026,hangA,50000,ngay1);
        Phim phim2 = new Phim("Sieu nhan anh hung", 2026,hangB,60000,ngay2);

        System.out.println("Gia ve phim " + phim1.getTenPhim() + " co re hon phim " + phim2.getTenPhim() + " hay khong: " + phim1.kiemTraGiaVe(phim2));
        System.out.println("-----");
        System.out.println("Hang san xuat phim " + phim1.getTenPhim() + " la: " + phim1.inTenHang());
        System.out.println("Hang san xuat phim " + phim2.getTenPhim() + " la: " + phim2.inTenHang());
        System.out.println("-----");

        System.out.println("Gia ve phim " +phim1.getTenPhim() + ":" + phim1.getGiaVe());
        System.out.println("Gia ve phim " + phim1.getTenPhim() + " sau khi ap khuyen mai: " + phim1.giaVeSauKM(10));
        System.out.println("Gia ve phim " +phim2.getTenPhim() + ":" + phim2.getGiaVe());
        System.out.println("Gia ve phim " + phim2.getTenPhim() + " sau khi ap khuyen mai: " + phim2.giaVeSauKM(20));


    }
}
