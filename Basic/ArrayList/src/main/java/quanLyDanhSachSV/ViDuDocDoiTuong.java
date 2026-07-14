package quanLyDanhSachSV;

import java.io.*;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try{
            File file = new File("D:\\Exercises\\Java\\FileIO\\file.dat");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv = (SinhVien) ois.readObject();
            System.out.println(sv);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
