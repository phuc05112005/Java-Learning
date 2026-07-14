import java.io.File;
import java.util.Scanner;

public class ViDuFile {
     File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }

    public boolean kiemTraDoc(){
        return this.file.canRead();
    }

    public boolean kiemTraViet(){
        return this.file.canWrite();
    }

    public void inDuongDan(){
        System.out.println("Duong dan: " + this.file.getAbsolutePath());
    }

    public void inTen(){
        System.out.println(this.file.getName());
    }

    public void kiemTraThuMucHayTapTin(){
        if(this.file.isFile()){
            System.out.println("La tap tin");;
        } else if (this.file.isDirectory()) {
            System.out.println("La thu muc");
        }
    }

    public void inDanhSachCacFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Danh sach cac tap tin/ thu muc con: ");
            File[] arr = this.file.listFiles();
            for(File x : arr){
                System.out.println(x);
            }
        } else if(this.file.isFile()){
            System.out.println("Day la tap tin, khong co cac tap tin/thu muc ben trong");
        }
    }


    public void inCayThuMuc(){
        inChiTietCayThuMuc(this.file, 0);
    }
    public void inChiTietCayThuMuc(File file, int bac){
        for(int i = 0; i< bac; i++){
            System.out.print("\t");
        }
        System.out.println(file.getName());

        if(file.isDirectory()){
            File[] arr = file.listFiles();
            for(File f : arr){
                inChiTietCayThuMuc(f, bac + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap duong dan file: ");
        String tenFile = sc.nextLine();
        ViDuFile viDuFile = new ViDuFile(tenFile);
        int luaChon;
        do{
            System.out.println("MEUNU");
            System.out.println("1. Kiem tra co the thuc thi khong?");
            System.out.println("2. Kiem tra file co the doc khong?");
            System.out.println("3. Kiem tra file co the ghi khong?");
            System.out.println("4. In duong dan");
            System.out.println("5. In ten file");
            System.out.println("6. Kiem tra file la thu muc hay la tap tin?");
            System.out.println("7. In ra danh sach cac file con");
            System.out.println("8. In ra cay thu muc");
            System.out.println("0. Thoat chuong trinhh");
            System.out.print("Chon: ");
            luaChon = sc.nextInt();
            switch (luaChon){
                case 1:
                    System.out.println(viDuFile.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(viDuFile.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(viDuFile.kiemTraViet());
                    break;
                case 4:
                    viDuFile.inDuongDan();
                    break;
                case 5:
                    viDuFile.inTen();
                    break;
                case 6:
                    viDuFile.kiemTraThuMucHayTapTin();
                    break;
                case 7:
                    viDuFile.inDanhSachCacFileCon();
                    break;
                case 8:
                    viDuFile.inCayThuMuc();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while(luaChon!=0);
    }
}
