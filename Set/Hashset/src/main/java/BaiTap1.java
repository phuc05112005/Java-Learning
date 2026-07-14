import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BaiTap1 {
    public static void main(String[] args) {
        int[] a = {5,2,8,5,1,2,9,10,8,3};
        Set<Integer> danhSach = new HashSet<>();

        int count = 0;
        for(int x : a){
            danhSach.add(x);
        }
        System.out.println("So phan tu trung: " + (a.length - danhSach.size()));

        System.out.println(danhSach);
        System.out.println("So luong phan tu trong danh sach con: " + danhSach.size());
    }
}
