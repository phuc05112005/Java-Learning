import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>(5);
        ArrayList<Integer> lst2 = new ArrayList<>(List.of(1,2,3,4,5,6));

        System.out.println(lst);
        System.out.println(lst1);
        System.out.println(lst2);

        // add - Them phan tu
        ArrayList<Integer> lst3 = new ArrayList<>();
        lst3.add(43);
        lst3.add(0,99);
        lst3.add(52);
        System.out.println(lst3);


        // size - Tra ve so phan tu cua list
        System.out.println(lst3.size());


        // get - Tra ve gia tri list tai vi tri index
        System.out.println(lst3.get(1));


        // remove - Xoa gia tri tai vi tri index
        lst3.remove(1);
        System.out.println(lst3);
        // Xoa gia tri chi dinh
        ArrayList<Integer> lst4 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(lst4);
        lst4.remove(Integer.valueOf(3));
        System.out.println(lst4);


        // set(index, element) - Thay doi thong tin
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3));
        System.out.println(lst5);
        lst5.set(1,5);
        System.out.println(lst5);


        // contains() - Kiem tra Collection co chua phan tu nao do hay khong
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean check = lst6.contains(0);
        System.out.println(check);


        // Collections.sort(list) - Sap xep tang dan
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(6,23,8,2,854,2,72,355,32));
        Collections.sort(lst7);
        System.out.println(lst7);


        // indexOf() - Tim vi tri dau tien cua element trong list
        ArrayList<String> lst8 = new ArrayList<>(List.of("le","hoang","phuc"));
        System.out.println(lst8.indexOf("phuc"));
        System.out.println(lst8.indexOf("duc"));


        // Duyet list
        // cach 1:
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        System.out.println("Duyet bang for: ");
        for(int c : lst9){
            System.out.println(c);
        }

        // cach 2 (Khi can su dung den cac chi so index)
        System.out.println("--------");
        for(int i = 0; i<lst9.size();i++){
            int c = lst9.get(i);
            System.out.println(c);
        }

    }
}
