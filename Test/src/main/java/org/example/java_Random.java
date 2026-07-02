package org.example;

import java.util.Random;

public class java_Random {
    public static void main(String[] args) {
        Random rd = new Random();
        int soNguyen = rd.nextInt(0, 100);
        System.out.println(soNguyen);

        double soThuc = rd.nextDouble(0, 10);
        System.out.println(soThuc);
    }
}
