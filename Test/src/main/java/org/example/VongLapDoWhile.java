package org.example;

import java.util.Scanner;

public class VongLapDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        int Tong = 0;

        do{
            Tong += a;
            a++;
        } while (a <= 5);
        System.out.println(Tong);
    }
}
