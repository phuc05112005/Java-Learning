package construtor.BaiTap35;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXB;
    private TacGia tacGia;


    public Sach(String tenSach, double giaBan, int namXB, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXB = namXB;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void inTenSach(){
        System.out.println(tenSach);
    }

    public boolean kiemTra(Sach sachkhac){
        return this.namXB == sachkhac.namXB;
    }

    public double giaGiam(double x){
        return giaBan -= giaBan*(x/100);
    }

    @Override
    public String toString() {
        return "Sach: " + tenSach + ", gia ban: " + giaBan + ", nam xuat ban: " + namXB;
    }
}
