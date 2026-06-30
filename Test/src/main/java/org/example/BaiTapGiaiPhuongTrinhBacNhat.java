package org.example;

import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {

        double a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        a = sc.nextDouble();

        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem:");
            System.out.println("x = " + x);
        }

        sc.close();
    }
}