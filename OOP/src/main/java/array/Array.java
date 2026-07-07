package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double[] mang1 = new double[10];
        double mang2[];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < mang1.length; i++){
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            mang1[i] = sc.nextDouble();
        }

        double tong = 0;
        for(int i = 0; i < 5; i++){
            tong += mang1[i];

        }
        System.out.println("Tổng các phần tử mang 1: " + tong);



        mang2  = new double[]{1,2,3,4,5};
        double tong2 = 0;
        for(int i = 0; i < mang2.length; i++){
            tong2 += mang2[i];

        }
        System.out.println("Tong cac phan tu mang 2: " + tong2);
    }
}