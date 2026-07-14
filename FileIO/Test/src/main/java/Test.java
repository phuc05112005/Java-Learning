import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        // Kiem tra thu muc co ton hay khong
        File folder1 = new File("D:\\Exercises\\Java");
        File folder2 = new File("D:\\Projects\\FlyApp\\apps");

        System.out.println("Thu muc co ton tai khong: " + folder1.exists());
        System.out.println("Thu muc co ton tai khong: " + folder2.exists());

        // Tao thu muc
        File d1 = new File("D:\\Exercises\\Java\\FileIO\\Directory1");
        d1.mkdir();
        File d2 = new File("D:\\Exercises\\Java\\FileIO\\Directory1\\Directory2\\Directory3\\Directory4");
        d2.mkdirs();


        // Tao tap tin (.exe, .txt, .doc,..)
        File file1 = new File("D:\\Exercises\\Java\\FileIO\\Directory1\\data.xls");
        try{
            file1.createNewFile();
        } catch (IOException e){
            // Khong co quyen tao tap tin
            // O cung bi day
            // Duong dan sai
            e.printStackTrace();
        }

    }
}
