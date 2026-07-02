package bai20;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String mk = "";
        while(true){
            System.out.print("Nhap mat khau de tao tai khoan (it nhat 6 ki tu, co it nhat 1 chu cai va it nhat 1 so: ");
            String newmk = sc.nextLine();
            if(checkMK(newmk)){
                mk = newmk;
                System.out.println("Mat khau da duoc luu");
                break;
            }
            else{
                System.out.println("MK khong hop le, vui long nhap lai");
            }
        }

        int count = 0;
        String login;
        while(true){
            System.out.print("Nhap mat khau dang nhap: ");
            login = sc.nextLine();
            if(login.equals(mk)){
                System.out.println("Dang nhap thanh cong");
                break;
            } else {
                System.out.print("Sai Mk, nhap lai: ");
                count++;
            }

            if(count==5){
                System.out.println("Da nhap het 5 lan, dang nhap bi khoa");
                break;
            }
        }

    }

    public static boolean checkMK(String mk) {
        if (mk.length() < 6)
            return false;

        boolean hasIsLetter = false;
        for(char c : mk.toCharArray()){
            if(Character.isLetter(c)){
                hasIsLetter = true;
                break;
            }
        }
        if (!hasIsLetter){
            return false;
        }

        boolean hasIsDigit = false;
        for(char c : mk.toCharArray()){
            if(Character.isDigit(c)){
                hasIsDigit = true;
                break;
            }
        }
        if(!hasIsDigit){
            return false;
        }

        //Neu du do dai, co it nhat 1 chu cai va it nhat 1 so => tra ve true
        return true;
    }

}
