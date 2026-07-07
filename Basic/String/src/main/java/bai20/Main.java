package bai20;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mk = "";
        while(true){
            System.out.print("Nhap tao mat khau: ");
            String newMk = sc.nextLine();
            if(checkMK(newMk)){
                mk = newMk;
                System.out.println("Tao mat khau thanh cong!");
                break;
            } else {
                System.out.println("MK khong hop le, phai co it nhat 6 ki tu, 1 chu so va 1 chu cai!");
            }
        }

        String mkLogin;
        int count = 0;
        while(count < 5){
            System.out.print("Nhap mat khau dang nhap: ");
            mkLogin = sc.nextLine();
            if(mkLogin.equals(mk)){
                System.out.println("Dang nhap thanh cong!");
                break;
            }
            else{
                System.out.println("Sai mat khau, nhap lai!");
                count++;
            }
        }

    }

    public static boolean checkMK(String mk){
        if(mk.length()<6){
            return false;
        }
        boolean coSo = false;
        boolean coChu = false;
        for(char c : mk.toCharArray()){
            if(Character.isLetter(c)){
                coChu = true;
            }
            else if(Character.isDigit(c)){
                coSo = true;
            }

            if(coChu && coSo){
                return true;
            }
        }
        return false;
    }
}