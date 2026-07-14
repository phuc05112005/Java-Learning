import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TuDien {
    Map<String, String> tuDien = new TreeMap<String, String>();

    public String themTu(String tuKhoa, String yNghia){
        return this.tuDien.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa){
        return this.tuDien.remove(tuKhoa);
    }

    public void inTuKhoa(){
        if(tuDien.isEmpty()){
            System.out.println("Khong co tu nao trong tu dien");
        }
        for (Map.Entry<String, String> entry : tuDien.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

     public int soLuong(){
        return this.tuDien.size();
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuDien tuDien = new TuDien();
        int luaChon;

        do{
            System.out.println("MENU");
            System.out.println("1. Them tu/ Sua y nghia");
            System.out.println("2. Xoa tu");
            System.out.println("3. In tu dien");
            System.out.println("4. Tong so tu trong tu dien");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==1 || luaChon==2){
                System.out.print("Nhap tu khoa: ");
                String tuKhoa = sc.nextLine();
                if(luaChon==1){
                    System.out.print("Nhap y nghia: ");
                    String yNghia = sc.nextLine();
                    String old = tuDien.themTu(tuKhoa, yNghia);
                    if(old==null){
                        System.out.println("Them tu moi thanh cong");
                    } else {
                        System.out.println("Cap nhat y nghia thanh cong");
                    }
                } else {
                    tuDien.xoaTu(tuKhoa);
                    System.out.println("Xoa thanh cong");
                }
            } else if (luaChon==3) {
                System.out.println("Danh sach tu ");
                tuDien.inTuKhoa();
            } else if (luaChon==4) {
                System.out.println("Tong so tu co trong tu dien: " + tuDien.soLuong());
            } else if(luaChon==0){
                System.out.println("Tam biet");
            } else {
                System.out.println("Lua chon khong hop le");
            }
        } while(luaChon!=0);

    }
}

