package catChuoiThanhMang;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Xin chao cac ban, toi la Peter";

        String[] a = s.split("\\s+ ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s2 = "Xin chao cac ban. Toi la Peter, 20 tuoi";
        String[] c = s2.split("[.,]");
        System.out.println(Arrays.toString(c));
        System.out.println(c[c.length-2]);
    }
;;}
