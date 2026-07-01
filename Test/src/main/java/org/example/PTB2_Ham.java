package org.example;

import java.util.Scanner;

public class PTB2_Ham {
    public static void main(String[] args) {

        String kq1 = GiaiPT(1,2,3);
        System.out.println(kq1);

//
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a:");
        double a = sc.nextDouble();
        System.out.print("Nhap so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap so c: ");
        double c = sc.nextDouble();
        String kq = GiaiPT(a,b,c);
        System.out.println(kq);

    }

    public static String GiaiPT(double a, double b, double c) {
        if(a == 0){
            if (b == 0 && c ==0){
                return "PT vo so nghiem";
            } else if(b == 0 && c!=0){
                return "PT vo nghiem";
            } else{
                return "PT bac nhat co nghiem: " + (-c/b);
            }
        }
        else{
            double delta = (b*b) - (4*a*c);
            if(delta < 0){
                return "PT vo nghiem";
            } else if(delta == 0){
                return "PT co nghiem kep x1 = x2 = " + (-b/2*a);
            }else{
                double x1 = (-b - Math.sqrt(delta)) / (2*a);
                double x2 = (-b + Math.sqrt(delta)) / (2*a);
                return "PT co 2 nghiem x1 = " + x1 + ", x2 = " + x2;
            }
        }
    }
}
