package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        int thang = cal.get(Calendar.MONTH) + 1;
        int nam = cal.get(Calendar.YEAR);
        System.out.println(ngay + "/" + thang + "/"+ nam);

        cal.set(Calendar.YEAR, 2005);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 5);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        int thangSinh = cal.get(Calendar.MONTH) + 1;
        int namSinh = cal.get(Calendar.YEAR);
        System.out.println(ngaySinh + "/" + thangSinh + "/" + namSinh);


        // Xuat theo dinh dang
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}
