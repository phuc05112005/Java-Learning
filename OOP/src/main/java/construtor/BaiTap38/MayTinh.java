package construtor.BaiTap38;

public class MayTinh {
    private HangSX hangSX;
    private NgaySX ngaySX;
    private double giaBan;
    private int thoiGianBH;


    public MayTinh(HangSX hangSX, NgaySX ngaySX, double giaBan, int thoiGianBH) {
        this.hangSX = hangSX;
        this.ngaySX = ngaySX;
        this.giaBan = giaBan;
        this.thoiGianBH = thoiGianBH;
    }

    public HangSX getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSX hangSX) {
        this.hangSX = hangSX;
    }

    public NgaySX getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(NgaySX ngaySX) {
        this.ngaySX = ngaySX;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }


    public boolean soSanhGiaBan(MayTinh mayTinhKhac){
        return this.giaBan< mayTinhKhac.giaBan;
    }

    public String inTenQG(){
        return this.hangSX.getQuocGia().getTenQG();
    }

    public String inTenHang(){
        return this.hangSX.getTenHang();
    }
}
