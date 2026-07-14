import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuCopyFile {
    public static void copyAll(File f1, File f2) {
        try{
            if(f1.isDirectory()){
                Files.createDirectories(f2.toPath());
                File[] arr = f1.listFiles();
                for(File file : arr){
                    File fileNew = new File(f2, file.getName());
                    copyAll(file, fileNew);
                }
            }
            else {
                Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File f0 = new File("D:\\Exercises\\Java\\FileIO\\f0");
        File f1 = new File("D:\\Exercises\\Java\\FileIO\\f00\\f1");

        // Doi tap tin hoac thu muc
//        try{
//            Files.move(f0.toPath(),f1.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch(IOException e){
//            e.printStackTrace();
//
//        }




//        // Di chuyen file
//        File f1new = new File("D:\\Exercises\\Java\\FileIO\\f0\\f1");
//        try {
//            Files.move(f1.toPath(), f1new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch(IOException e){
//            e.printStackTrace();
//        }



        // Copy file
        File f1new = new File("D:\\Exercises\\Java\\FileIO\\f0");
        File f1copy = new File("D:\\Exercises\\Java\\FileIO\\f00");
        try{
            Files.copy(f1new.toPath(),f1copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch(IOException e){
            e.printStackTrace();
        }
        // Copy toan bo du lieu
        ViDuCopyFile.copyAll(f1new,f1copy);
        }
}
