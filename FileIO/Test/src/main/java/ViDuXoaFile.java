import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
    public static void xoaFile(File f){
        if(f.isDirectory()){
            File[] arr = f.listFiles();
            for(File file : arr){
                xoaFile(file);
            }
            f.delete();
        } else if(f.isFile()){
            f.delete();
        }
    }

    public static void main(String[] args) {
        File f0 = new File("D:\\Exercises\\Java\\FileIO\\f0");
        File f0_1 = new File("D:\\Exercises\\Java\\FileIO\\f0_1");
        File vidu = new File("D:\\Exercises\\Java\\FileIO\\vidu.txt");

//        f0.deleteOnExit(); Khong xoa duoc vi co chua cac tap tin
//        f0_1.deleteOnExit(); Xoa duoc vi la thu muc rong
//        vidu.deleteOnExit(); Xoa duoc vi la tap tin

        // Su dung class Files
        Path p0 = Path.of("D:\\Exercises\\Java\\FileIO\\f0");
        Path p0_1 = Path.of("D:\\Exercises\\Java\\FileIO\\f0_1");

       try{
           Files.deleteIfExists(p0_1);
       } catch(IOException e){
           e.printStackTrace();
       }
    }

}
