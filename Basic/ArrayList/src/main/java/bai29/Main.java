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
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = 0; i < n; i++){
            lst.add(rd.nextInt(1,101));
        }

        System.out.println(lst);

        for(int c : lst){
            Math.pow(c, 2);
            System.out.println(c);
        }

    }
}
