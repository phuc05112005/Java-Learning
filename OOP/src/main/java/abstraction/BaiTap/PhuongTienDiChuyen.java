package abstraction.BaiTap;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSX hangSX;


    public PhuongTienDiChuyen(String loaiPhuongTien, HangSX hangSX) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSX = hangSX;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSX getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSX hangSX) {
        this.hangSX = hangSX;
    }

    public String layTenHangSanXuat(){
        return this.getHangSX().tenHangSanXuat;
    }

    public void batDau(){
    }

    public void tangToc(){

    }
    public void dungLai(){

    }

    public abstract double layVanToc();
}

