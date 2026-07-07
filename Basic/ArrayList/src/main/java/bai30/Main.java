package bai30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>(List.of(
                "2 + 5 + 7 = ?",
                "5 * 10 = ?",
                "sqrt(16) = ?",
                "12%2 = ?"));

        ArrayList<Float> dapAn = new ArrayList<>(List.of(14f, 50f, 4f, 0f));
        for(int i = 0; i<lst.size();i++){
            System.out.println(lst.get(i));
            System.out.print("Nhap dap an: ");
            Float traLoi = sc.nextFloat();
            if(traLoi.equals(dapAn.get(i))){
                System.out.println("Chinh xac!");
            } else {
                System.out.println("Khong dung! Dap an la " + dapAn.get(i));
            }
        }
    }
}
