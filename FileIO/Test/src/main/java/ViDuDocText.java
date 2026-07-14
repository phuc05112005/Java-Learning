import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViDuDocText {
    public static void main(String[] args) {
        // Cach 1
//        File file = new File("D:\\Exercises\\Java\\FileIO\\xinchao.txt");
//    try {
//        BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
//        String line = null;
//        while(true){
//            line = br.readLine();
//            if(line==null){
//                break;
//            } else {
//                System.out.println(line);
//            }
//        }
//    } catch (Exception e){
//        e.printStackTrace();
//    }



        // Cach 2 - Java 8<
    File file2 = new File("D:\\Exercises\\Java\\FileIO\\xinchao.txt");
    try{
        List<String> allText = Files.readAllLines(file2.toPath(), StandardCharsets.UTF_8);
        for(String line : allText){
            System.out.println(line);
        }
    } catch (Exception e){
        e.printStackTrace();
    }
    }
}

