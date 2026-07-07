package gameTaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        double taiKhoan = 5000.99;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("vi","VN");
        //NumberFormat numf = NumberFormat.getInstance(lc);
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        int luaChon = 1;
        do {
            System.out.println("MENU");
            System.out.println("Chon (1) - Tiep tuc choi");
            System.out.println("Chon phim bat ky - thoat");
            System.out.print("Nhap: ");
            luaChon = sc.nextInt();
            if (luaChon == 1) {
                System.out.println("BAT DAU");
                System.out.println("So tien trong tai khoan: " + numf.format(taiKhoan));
                System.out.println("Ban muon cuoc bao nhieu ?");
                double datCuoc = 0;
                do {
                    System.out.print("Nhap vao so tien muon dat cuoc: ");
                    datCuoc = sc.nextDouble();

                } while (datCuoc <= 0 || datCuoc > taiKhoan);


                int luaChonTaiXiu = 0;
                do {
                    System.out.print("Nhap (1) - Tai, (2) - Xiu: ");
                    luaChonTaiXiu = sc.nextInt();

                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                // Tung xuc xac
                Random rd = new Random();

                int giaTri1 = rd.nextInt(6) + 1;
                int giaTri2 = rd.nextInt(6) + 1;
                int giaTri3 = rd.nextInt(6) + 1;
                int tong = giaTri1 + giaTri2 + giaTri3;

                System.out.println("Ket qua: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if (tong == 3 || tong == 18) {
                    System.out.println("Tong: " + tong + "=> Nha cai thang, ban thua!");
                    taiKhoan -= datCuoc;
                    System.out.println("So tien trong tai khoan con: " + numf.format(taiKhoan));
                } else if (tong >= 4 && tong <= 10) {
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Ban thang!");
                        taiKhoan += datCuoc;
                        System.out.println("So tien trong tai khoan con: " + numf.format(taiKhoan));
                    } else {
                        System.out.println("Ban thua!");
                        taiKhoan -= datCuoc;
                        System.out.println("So tien trong tai khoan con: " + numf.format(taiKhoan));
                    }
                } else {
                    if (luaChonTaiXiu == 1) {
                        System.out.println("Ban thang!");
                        taiKhoan += datCuoc;
                        System.out.println("So tien trong tai khoan con: " + numf.format(taiKhoan));
                    } else {
                        System.out.println("Ban thua!");
                        taiKhoan -= datCuoc;
                        System.out.println("So tien trong tai khoan con: " + numf.format(taiKhoan));
                    }
                }
            }
        }
        while (luaChon == 1);
    }
}