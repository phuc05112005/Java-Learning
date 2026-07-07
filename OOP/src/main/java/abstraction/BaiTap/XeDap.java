package abstraction.BaiTap;

public class XeDap extends PhuongTienDiChuyen {
    public XeDap(String loaiPhuongTien, HangSX hangSX) {
        super(loaiPhuongTien, hangSX);
    }

    @Override
    public double layVanToc() {
        return 20;
    }
}
