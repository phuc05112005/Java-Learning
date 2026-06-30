package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello em");

        String thongBao = "Xin chào";
        String hoVaTen = "Lê Hoàng Phúc";
         char kiTu = 'a';
         boolean check = true;
         final int n = 10;
         int tong = n + 100;
        System.out.println(tong);
        System.out.println(thongBao + " " + hoVaTen);


        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println("name: " + name + ", tuoi: " + age);


        int a = 10;
        float b = 20.5f;

        System.out.println(a + (int)b);
        System.out.println((float)a + b);
    }
}