package bai28;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu trong list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            lst.add(sc.nextInt());
        }
        System.out.println(lst);


        ArrayList<Integer> lstMoi = new ArrayList<>();
        for(int x : lst){
            lstMoi.add(x*x);
        }
        System.out.println(lstMoi);


        // Dem co bao nhieu phan tu lon hon 10
        int count = 0;
        for(int a : lstMoi){
            if(a > 10){
                count++;
            }
        }
        System.out.println("So phan tu lon hon 10 trong list: " + count);
    }
}
