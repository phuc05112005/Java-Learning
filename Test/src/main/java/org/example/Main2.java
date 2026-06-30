package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        double tich = (double) a * b;
        System.out.println(a + " * " + b + " = " + tich);
        double thuong = (double) a / b;
        System.out.println(a + " / " + b + " = " + thuong);
        int soDu = a % b;
        System.out.println(a + " % " + b + " = " + soDu);

        String ketQua = (a%2==0)?"chẵn":"lẻ";
        System.out.println("a là số "+ ketQua + ": " + a);


        System.out.println("Min(a, b): " + Math.min(a, b));
        System.out.println("Max(a, b): " + Math.max(a, b));
        System.out.println("|a|: " + Math.abs(a));
        System.out.println("Ceil(a): " + Math.ceil((double)a));
        System.out.println("Floor(a): " + Math.floor((double)a));
        System.out.println("sqrt(a): " + Math.sqrt(a));
        System.out.println("a^b: " + Math.pow(a, b));
    }
}
