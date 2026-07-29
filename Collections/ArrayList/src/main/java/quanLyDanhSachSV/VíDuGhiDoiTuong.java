package quanLyDanhSachSV;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class VíDuGhiDoiTuong {
    public static void main(String[] args) {
        try{
        File file = new File("D:\\Exercises\\Java\\FileIO\\file.dat");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sv = new SinhVien("123","Le Hoang Duc", 2005, 9.3);
            oos.writeObject(sv);

            oos.flush();
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
