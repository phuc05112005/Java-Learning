package bai29;

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
        for(int i = 0; i<n; i++){
            arr.add(rd.nextInt(100));
        }
        System.out.println("List: " + arr.toString());


        ArrayList<Integer> arrBP = new ArrayList<>();
        for(int x : arr){
            arrBP.add(x*x);
        }
        System.out.println("List sau khi binh phuong: "  + arrBP.toString());
    }
}