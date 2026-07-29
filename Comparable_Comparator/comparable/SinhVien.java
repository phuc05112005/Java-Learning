package comparable;

public class SinhVien implements Comparable<SinhVien> {
    private int maSV;
    private  String hoTen;
    private String tenLop;
    private double diemTB;


    public SinhVien(int maSV, String hoTen, String tenLop, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tenLop = tenLop;
        this.diemTB = diemTB;
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

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String layTen(){
        String s = this.hoTen.strip();
        if(s.indexOf(" ")>=0){
            return s.substring(s.lastIndexOf(" ") + 1);
        } else {
            return s;
        }
    }

    @Override
    public int compareTo(SinhVien sinhVienKhac) {
        String tenSv = this.layTen();
        String tenSvKhac = sinhVienKhac.layTen();
        return tenSv.compareTo(tenSvKhac);
    }
}
