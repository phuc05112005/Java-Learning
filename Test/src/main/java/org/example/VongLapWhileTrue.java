package org.example;

public class VongLapWhileTrue {
    public static void main(String[] args) {
        int n = 0;

        while(true){
            n++;
            System.out.println(n);
            if(n==5)
                break;
        }
    }
}
