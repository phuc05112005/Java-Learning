package abstraction.BaiTap;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;


    public MayBay(String loaiPhuongTien, HangSX hangSX, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){}
    public void haCanh(){}

    @Override
    public double layVanToc() {
        return 800;
    }
}
