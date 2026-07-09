package bai31;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong list: ");
        int n = sc.nextInt();
        Random rd = new Random();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<n;i++){
            arr.add(rd.nextInt(160));
        }
        System.out.println(arr.toString());

        int count = 0;
        StringBuilder viTri = new StringBuilder();
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i) < 80){
                count++;
                viTri.append(i).append(" ");
            }
        }
        System.out.println("Tong so phan tu nho hon 80: " + count);
        System.out.println("Vi tri index cua nhung phan tu trong list tuong ung: " + viTri);
    }
}
