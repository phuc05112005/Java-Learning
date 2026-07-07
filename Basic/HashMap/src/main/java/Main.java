import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Them phan tu vao hashmap
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"orange");

        // Lay gia tri cua 1 phan tu
        String value = map.get(1);
        System.out.println(value);


        // Xoa phan tu khoi hashmap
        map.remove(2);
        System.out.println(map.toString());


        // Kiem tra 1 phan tu co ton tai trong hashmap khong
        System.out.println(map.containsKey(4));

        // Kiem tra 1 gia tri co ton tai trong hashmap khong
        System.out.println(map.containsValue("apple"));

        //Kiem tra hashmap co rong hay khong
        System.out.println(map.isEmpty());


        // Kiem tra so luong phan tu trong hashmap
        System.out.println(map.size());


        // Duyet hashmap
        for(Integer key : map.keySet()){
            String vl = map.get(key);
            System.out.println(key + " : "  + vl);
        }
    }
}
