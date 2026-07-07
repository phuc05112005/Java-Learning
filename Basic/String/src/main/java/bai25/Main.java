package bai25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 chuoi: ");
        String str = sc.nextLine();

        String chuoiDao = new StringBuilder(str).reverse().toString();
        System.out.println(chuoiDao);
         if(chuoiDao.equalsIgnoreCase(str)){
             System.out.println("Day la Panlyndrome!");
         }
         else {
             System.out.println("Day ko phai Panlyndrome!");
         }
    }
}
