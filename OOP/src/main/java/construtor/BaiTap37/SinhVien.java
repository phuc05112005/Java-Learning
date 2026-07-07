package construtor.BaiTap37;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private NgaySinh ngaySinh;
    private double diemTB;
    private Lop lop;


    public SinhVien(int maSV, String hoTen, NgaySinh ngaySinh, double diemTB, Lop lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }


    public String inTenKhoa(){
        return lop.getTenKhoa();
    }


    public boolean kiemTraDau(){
        return diemTB >= 5;
    }

    public boolean kiemTraNgaySinh(SinhVien sinhVienKhac){
        return this.ngaySinh.soSachNgaySinh(sinhVienKhac.ngaySinh);
    }
}