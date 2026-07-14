import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class ViDuGhiText {
    public static void main(String[] args) {
        try(
            PrintWriter pw = new PrintWriter("D:\\Exercises\\Java\\FileIO\\xinchao.txt", StandardCharsets.UTF_8)){
            pw.println("Xin chao ban");

            Student st = new Student("Lê Hồng Đức", 20);
            pw.println(st);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
