import java.util.*;

public class phieuDuThuong_HashSet {
        Set<String> thungPhieu = new HashSet<String>();

        public boolean themPhieu(String giaTri){
            return this.thungPhieu.add(giaTri);
        }

        public boolean xoaPhieu(String giaTri){
            return this.thungPhieu.remove(giaTri);
        }

        public boolean kiemTraTonTai(String giaTri){
            return this.thungPhieu.contains(giaTri);
        }

        public void xoaTatCa(){
            this.thungPhieu.clear();
        }

        public int soLuong(){
            return this.thungPhieu.size();
        }

    public String rutPhieu() {

        if(thungPhieu.isEmpty()){
            return null;
        }

        ArrayList<String> ds = new ArrayList<>(thungPhieu);

        Random rd = new Random();

        int index = rd.nextInt(ds.size());

        return ds.get(index);

    }

    public void inTatCa(){
            System.out.println(Arrays.toString(this.thungPhieu.toArray()));
    }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            phieuDuThuong_HashSet dsPhieu = new phieuDuThuong_HashSet();
            int luaChon;
            do{
                System.out.println("MENU");
                System.out.println("1. Them phieu");
                System.out.println("2. Xoa phieu");
                System.out.println("3. Kiem tra phieu co ton tai khong");
                System.out.println("4. So luong phieu du thuong");
                System.out.println("5. Xoa tat ca phieu");
                System.out.println("6. Rut tham trung thuong");
                System.out.println("7. In tat ca phieu");
                System.out.println("0. Thoat");
                System.out.print("Chon: ");
                luaChon = sc.nextInt();
                sc.nextLine();
                if(luaChon==1 || luaChon==2 || luaChon==3){
                    System.out.print("Nhap vao ma phieu du thuong: ");
                    String giaTri = sc.nextLine();
                    if(luaChon==1){
                        dsPhieu.themPhieu(giaTri);
                    } else if(luaChon==2){
                        dsPhieu.xoaPhieu(giaTri);
                    } else {
                        if(dsPhieu.kiemTraTonTai(giaTri)){
                            System.out.println("Phieu co ton tai");
                        } else {
                            System.out.println("Khong ton tai");
                        }
                    }
                } else if(luaChon==4){
                    System.out.println(dsPhieu.soLuong());
                } else if(luaChon==5){
                    dsPhieu.xoaTatCa();
                    System.out.println("Da xoa tat ca phieu trong thung");
                } else if(luaChon==6) {
                    System.out.println(dsPhieu.rutPhieu());
                } else if(luaChon==7){
                    dsPhieu.inTatCa();
                }
            } while(luaChon!=0);
        }
}
