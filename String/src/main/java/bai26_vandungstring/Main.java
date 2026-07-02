package bai26_vandungstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();

        int demSo = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demSpace = 0;

        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                demSo++;
            }
            else if(Character.isLowerCase(c)){
                demInThuong++;
            }
            else if(Character.isUpperCase(c)){
                demInHoa++;
            }
            else if(Character.isWhitespace(c)){
                demSpace++;
            }
        }

        System.out.println("Chuoi ki tu: "+ s);
        System.out.println("So luong chu so: " + demSo);
        System.out.println("So luong chu in hoa: " + demInHoa);
        System.out.println("So luong chu in thuong: " + demInThuong);
        System.out.println("So luong khoang trang: " + demSpace);
    }
}
