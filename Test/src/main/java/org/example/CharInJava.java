package org.example;

import java.util.Scanner;

public class CharInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao chuoi ki tu: ");;
        String s = sc.nextLine();
        System.out.println("ki tu dau tien trong chuoi: " + s.charAt(0));

        // So sanh a - b
        System.out.println(Character.compare('a','b'));

        // Truyen vao chu so
        System.out.println(Character.isDigit('1'));

        // Kiem tra chu cai
        System.out.println(Character.isLetter('a'));

        //Kiem tra  truyen vao khoang trang
        System.out.println(Character.isWhitespace(' '));

        // Kiem tra truyen vao chu in hoa
        System.out.println(Character.isUpperCase('h'));

        // Kiem tra truyen vao chu in thuong
        System.out.println(Character.isLowerCase('a'));
    }
}
