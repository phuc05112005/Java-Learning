package construtor.BaiTap36;

public class Phim {
    private String tenPhim;
    private int namXS;
    HangSanXuat hangSanXuat;
    private double giaVe;
    NgayChieu ngayChieu;


    public Phim(String tenPhim, int namXS, HangSanXuat hangSanXuat, double giaVe, NgayChieu ngayChieu) {
        this.tenPhim = tenPhim;
        this.namXS = namXS;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamXS() {
        return namXS;
    }

    public void setNamXS(int namXS) {
        this.namXS = namXS;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }


    public boolean kiemTraGiaVe(Phim phimKhac){
            return this.giaVe < phimKhac.giaVe;
    }

    public String inTenHang(){
        return hangSanXuat.getTen();
    }

    public double giaVeSauKM(double x){
        return giaVe -= giaVe*(x/100);
    }
}
