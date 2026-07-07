package bai31;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        Random rd = new Random();
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i<n; i++){
            lst.add(rd.nextInt(0,160));
        }
        System.out.println(lst);

        int dem = 0;
        String viTri = "";
        for(int i = 0; i<lst.size(); i++){
            if(lst.get(i)<80){
                dem++;
                viTri += i + " ";
            }
        }
        System.out.println("So luong phan tu <80 trong list: " + dem);
        System.out.println("Vi tri cua cac phan tu do la: " + viTri);

    }
}
