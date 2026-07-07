package bai23;

import java.sql.SQLData;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi gom chu va so: ");
        String input = sc.nextLine();

        StringBuilder chu = new StringBuilder();
        StringBuilder so = new StringBuilder();
        StringBuilder khac = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                so.append(c);
            }
            else if(Character.isLetter(c)){
                chu.append(c);
            }
            else {
                khac.append(c);
            }
        }

        System.out.println("Chuoi chu: " + chu);
        System.out.println("Chuoi so: " + so);
        System.out.println("Khong phai chu va so: " + khac);
    }
}
