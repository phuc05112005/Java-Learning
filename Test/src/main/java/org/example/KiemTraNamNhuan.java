package org.example;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
        if((nam % 4 ==0 && nam % 100 != 0) ||(nam % 400 == 0)){
            System.out.println("Nam nhuan");
        }else{
            System.out.println("Khong phai nam nhuan");
        }
    }
}
