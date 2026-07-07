package abstraction.BaiTap;

public class Main {
    public static void main(String[] args) {
        HangSX hang1 = new HangSX("Tokyo","Japan");
        HangSX hang2 = new HangSX("Porsche","USA");
        HangSX hang3 = new HangSX("Vietjet", "VietNam");

        PhuongTienDiChuyen pt1 = new XeDap("Xe 2 banh",hang1);
        PhuongTienDiChuyen pt2 = new XeOto("Xe 4 banh",hang2,"Xang E10");
        PhuongTienDiChuyen pt3 = new MayBay("May bay", hang3, "Xang Ron97");

        System.out.println(pt1.layVanToc() + pt1.layTenHangSanXuat());
        System.out.println(pt2.layVanToc() + pt2.layTenHangSanXuat());
        System.out.println(pt3.layVanToc() + pt3.layTenHangSanXuat());


    }
}
