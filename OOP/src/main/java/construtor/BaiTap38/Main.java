package construtor.BaiTap38;

public class Main {
    public static void main(String[] args) {
        QuocGia nuoc1 = new QuocGia(123,"Viet Nam");
        QuocGia nuoc2 = new QuocGia(122, "Han Quoc");

        HangSX hang1 = new HangSX("Samsung",nuoc1);
        HangSX hang2 = new HangSX("ASUS", nuoc2);

        NgaySX ngay1 = new NgaySX(5,6,2024);
        NgaySX ngay2 = new NgaySX(8,12, 2023);

        MayTinh may1 = new MayTinh(hang1, ngay1, 23000000,24);
        MayTinh may2 = new MayTinh(hang2, ngay2, 42000000, 36);

        System.out.println("May tinh 1 co gia thap hon gia may tinh 2 khong: " + may1.soSanhGiaBan(may2));
        System.out.println("Ten quoc gia cua may " + may2.inTenHang() + ": " + may2.inTenQG());
    }
}
