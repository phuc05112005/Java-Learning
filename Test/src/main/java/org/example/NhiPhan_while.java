package org.example;

import java.util.Scanner;

public class NhiPhan_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen >0: ");
        int n = sc.nextInt();

        String nhiPhan = "";
        while(n>0){
            nhiPhan = (n%2) + nhiPhan;
            n = n/2;
        }
        System.out.println("Nhi phan cua so vua nhap la: " + nhiPhan);
    }
}
