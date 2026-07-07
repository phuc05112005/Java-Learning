package abstraction.BaiTap;

public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;


    public XeOto(String loaiPhuongTien, HangSX hangSX, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 60;
    }
}
