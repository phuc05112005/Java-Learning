package bai33;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("user1","1232455");
        dict.put("user2","1235455");
        dict.put("user3","1234565");
        dict.put("user4","1234525");
        dict.put("user5","1234535");
        dict.put("user6","12341255");
        dict.put("user7","1234555");
        dict.put("user8","1234585");
        dict.put("user9","1236455");
        dict.put("user10","1523455");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap username: ");
        String username = sc.nextLine();
        String password = "";
        String mk = dict.get(username);


        if(dict.containsKey(username)){
            while(true){
                System.out.print("Nhap password: ");
                password = sc.nextLine();
                if(mk.equals(password)){
                    System.out.println("Dang nhap thanh cong!");
                    break;
                }
                else {
                    System.out.println("Password sai!");
                }
            }
        } else {
            System.out.println("username khong ton tai!");
        }
    }
}
