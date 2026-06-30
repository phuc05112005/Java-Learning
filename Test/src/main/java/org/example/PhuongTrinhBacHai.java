package org.example;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.print("Nhap c: ");
        c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4*a*c);
        if(delta < 0){
            System.out.println("PT vo so nghiem");
        }
        else if(delta == 0){
            double x = -b/(2*a);
            System.out.println("PT co nghiem kep: x1 = x2 = " + x);
        }
        else {
            double x1 = (-b-Math.sqrt(delta))/(2*a);
            double x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("PT co 2 nghiem: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
