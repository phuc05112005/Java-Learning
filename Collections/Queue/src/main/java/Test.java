import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        danhSachSV.offer("Le");
        danhSachSV.offer("Hoang");
        danhSachSV.offer("Phuc");

        while(true){
            String ten = danhSachSV.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
        System.out.println();


        // PriorityQueue - Sap xep
        Queue<String> danhSachSV1 = new PriorityQueue<String>();
        danhSachSV1.offer("Nguyen Van B");
        danhSachSV1.offer("Nguyen Van C");
        danhSachSV1.offer("Nguyen Van A");

        while(true){
            String ten = danhSachSV1.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
    }
}
