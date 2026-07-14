
import java.util.*;

public class QuanLyBienSoXe {

    Set<String> danhSachBien = new LinkedHashSet<String>();

    public boolean themBienSo(String so){
        return this.danhSachBien.add(so);
    }

    public boolean xoaBienSo(String so){
        return this.danhSachBien.remove(so);
    }

    public boolean kiemTra(String so){
        return this.danhSachBien.contains(so);
    }

    public int demBienSo(){
        return this.danhSachBien.size();
    }

    public void inTatCa(){
        if(danhSachBien.isEmpty()){
            System.out.println("Danh sach rong");
        }

        System.out.println("Danh sach cac bien so:");
        for(String x : danhSachBien){
            System.out.println(x);
        }
    }

    public void xoaTatCa(){
        this.danhSachBien.clear();
        System.out.println("Da xoa tat ca bien so trong danh sach");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyBienSoXe ql = new QuanLyBienSoXe();
        int luaChon;
        do{
            System.out.println("MENU");
            System.out.println("1. Them bien so");
            System.out.println("2. Xoa bien so");
            System.out.println("3. Kiem tra");
            System.out.println("4. In tat ca");
            System.out.println("5. Dem");
            System.out.println("6. Xoa tat ca");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==1 || luaChon==2 || luaChon==3){
                System.out.print("Nhap bien so: ");
                    String so = sc.nextLine();
                    if(luaChon==1){
                            if(ql.themBienSo(so)){
                                System.out.println("Them thanh cong");
                            } else{
                                System.out.println("Bien so da ton tai");
                            }
                    } else if(luaChon==2) {
                        if(ql.xoaBienSo(so)){
                            System.out.println("Xoa thanh cong");
                        } else {
                            System.out.println("Khong tim thay bien so can xoa");
                        }
                    } else {
                        if(ql.kiemTra(so)){
                            System.out.println("Co bien so " + so + " trong danh sach");
                        } else {
                            System.out.println("Khong ton tai");
                        }
                    }
            } else if(luaChon==4){
                ql.inTatCa();
            } else if(luaChon==5){
                System.out.println("So luong bien so trong danh sach: " + ql.demBienSo() + " bien so");
            } else if(luaChon==6){
                ql.xoaTatCa();
            } else if (luaChon==0){
                System.out.println("Cam on ban, thoat chuong trinh");
                break;
            } else {
                System.out.println("Lua chon khong hop le");
            }
        } while(luaChon!=0);
    }
}
