package quanLyDanhSachSV;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        boolean timThay = false;

        for (SinhVien sv : danhSach){
            if(sv.getHoVaTen().contains(ten)){
                System.out.println(sv);
                timThay = true;
            }
        }

        if(!timThay){
            System.out.println("Khong co sinh vien can tim");
        }
    }

    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiemTB()<o2.getDiemTB()){
                    return 1;
                } else if(o1.getDiemTB()>o2.getDiemTB()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }


    public void ghiDuLieuXuongFile(File file){
        try{
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(SinhVien sinhVien : danhSach){
                oos.writeObject(sinhVien);
            }
            oos.flush();
            oos.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public void docDuLieuFile(File file){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            SinhVien sv = null;
            while(true){
                Object oj = ois.readObject();
                if(oj==null){
                    break;
                }
                if(oj!=null){
                    sv = (SinhVien) oj;
                    this.danhSach.add(sv);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
