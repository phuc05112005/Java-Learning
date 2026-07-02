package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class TinhTuoi_DateTime {
    public static void main(String[] args) {

        int ngay = 0;
        int thang = 0;
        int nam = 0;
        int tuoi;

        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        try {
            System.out.print("Nhap ngay sinh: ");
            ngay = sc.nextInt();

            System.out.print("Nhap thang sinh: ");
            thang = sc.nextInt();

            System.out.print("Nhap nam sinh: ");
            nam = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Ban phai nhap vao so nguyen!");
            return;
        }

        // Kiểm tra dữ liệu cơ bản
        if (ngay < 1 || ngay > 31 ||
                thang < 1 || thang > 12 ||
                nam <= 0) {

            System.out.println("Ngay thang nam khong hop le!");
            return;
        }

        // Lưu ngày sinh
        Calendar birthday = Calendar.getInstance();
        birthday.set(nam, thang - 1, ngay);

        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        int thangSinh = birthday.get(Calendar.MONTH) + 1;
        int namSinh = birthday.get(Calendar.YEAR);

        System.out.println("Ngay sinh: "
                + ngaySinh + "/" + thangSinh + "/" + namSinh);

        // Lấy ngày hiện tại
        Calendar now = Calendar.getInstance();

        tuoi = now.get(Calendar.YEAR) - namSinh;

        // Nếu chưa đến sinh nhật năm nay thì giảm 1 tuổi
        if (now.get(Calendar.MONTH) + 1 < thangSinh ||
                ((now.get(Calendar.MONTH) + 1 == thangSinh)
                        && (now.get(Calendar.DAY_OF_MONTH) < ngaySinh))) {
            tuoi--;
        }

        System.out.println("Tuoi cua ban la: " + tuoi);
    }
}