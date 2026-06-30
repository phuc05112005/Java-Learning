package org.example;

public class XuLyNgoaiLe {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int c = a/b;
            System.out.println("c " + c);
        }
        catch(ArithmeticException ex){
            System.out.println("ERROR");
            ex.printStackTrace();
        }
        finally{
            System.out.println("OK finally!");
        }
        System.out.println("Đoạn code phía sau:");
    }
}
