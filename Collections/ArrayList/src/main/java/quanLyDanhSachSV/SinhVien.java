package quanLyDanhSachSV;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable {
    private String maSV;
    private String hoVaTen;
    private int namSinh;
    private double diemTB;


    public SinhVien(String maSV, String hoVaTen, int namSinh, double diemTB) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public SinhVien(String maSV) {
        this.maSV = maSV;
    }


    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: " + getMaSV() + " - Ho ten: " + getHoVaTen() + " - Nam sinh: " + getNamSinh() + " - Diem TB: " + getDiemTB();
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return Objects.equals(maSV, sinhVien.maSV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maSV, hoVaTen, namSinh, diemTB);
    }
}
