package quanLyDanhSachSV;

import java.util.ArrayList;
import java.util.Set;

public class DanhSachSV {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSV(){
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSV(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }

    public void inDanhSanhSV(){
        for(SinhVien sv : danhSach){
            System.out.println(sv.toString());
        }
    }

    public String kiemTraRong(){
        if(this.danhSach.isEmpty()){
            return "Danh sách rỗng";
        } else {
            return "Danh sách không rỗng";
        }
    }

    public int demSinhVien(){
        return this.danhSach.size();
    }

    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraSV(SinhVien sv){
        return this.danhSach.contains(sv);
    }

    public void xoaSinhVien(SinhVien sv){
        danhSach.remove(sv);
    }

    public void timKiemSV(String ten){
        for (SinhVien sv : danhSach){
            if(sv.getHoVaTen().contains(ten)){
                System.out.println(sv);
            } else {
                System.out.println("Khong co sinh vien can tim");
            }
        }
    }
}
