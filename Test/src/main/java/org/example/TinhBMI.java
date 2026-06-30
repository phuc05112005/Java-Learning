package org.example;

import java.util.Scanner;

public class TinhBMI {
    public static void main(String[] args) {
        float chieuCao, canNang;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao(m): ");
        chieuCao = sc.nextFloat();
        System.out.print("Nhập cân nặng(kg): ");
        canNang = sc.nextFloat();

        float bmi = canNang/(chieuCao*chieuCao);
        System.out.println("Chỉ số BMI: " + bmi);
        if(bmi < 15){
            System.out.println("Thân hình quá gầy");
        } else if(bmi >= 15 && bmi < 16){
            System.out.println("Thân hình gầy");
        } else if(bmi >= 16 && bmi <18){
            System.out.println("Thân hình hơi gầy");
        }else {
            System.out.println("Thân hình không gầy");
        }

    }
}
