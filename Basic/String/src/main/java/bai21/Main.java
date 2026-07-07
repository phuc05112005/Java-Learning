package bai21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mat khau can ma hoa: ");
        String input = sc.nextLine();

        String output = "";
        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            int index = a.indexOf(c);

            if(index == -1){
                output += c;
            } else {
                output += b.charAt(index);
            }
        }
        System.out.println("Mat khau sai khi ma hoa: " + output);
    }
}
