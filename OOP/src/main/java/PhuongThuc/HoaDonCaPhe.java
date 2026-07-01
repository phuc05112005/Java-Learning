package PhuongThuc;

public class HoaDonCaPhe {
    private String loaiCaPhe;
    private double giaTien;
    private  double khoiLuong;

    public HoaDonCaPhe(String loai, double gia, double kl){
        this.loaiCaPhe = loai;
        this.giaTien = gia;
        this.khoiLuong = kl;
    }

    public double tinhTong(){
        return this.khoiLuong*this.giaTien;
    }

    public boolean kiemTra(double kl){
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTienLonHon300(){
        return this.tinhTong() > 300000;
    }

    public double giamGia(double x){
        if(this.kiemTraTongTienLonHon300()){
            return (x/100)*this.tinhTong();
        }
        else{
            return 0;
        }
    }

    public double giaSauGiam(double x){
        return this.tinhTong() - this.giamGia(x);
    }

}
