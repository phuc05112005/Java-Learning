package bai28;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong list: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        Random rd = new Random();

        for(int i = 0; i<n; i++){
            arr.add(rd.nextInt(1,100));
        }
        System.out.println("List: " + arr.toString());
    }
}
