package org.example;

import java.util.Scanner;

public class VongLapWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bat ky trong khoang 1 - 10: ");
        int x = sc.nextInt();
        while(x >10  || x < 1){
            System.out.print("Nhap so trong 1 - 10 thoi, nhap lai: ");
            x = sc.nextInt();
        }
        System.out.println("Ban da nhap xong");
    }
}
