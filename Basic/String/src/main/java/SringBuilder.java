public class SringBuilder {
    public static void main(String[] args) {
        // StringBuilder - khoi tao, gom: append, insert, delete, reserve
        StringBuilder sb = new StringBuilder();

        // append - Them vao cuoi chuoi
        sb.append("Hi Alice! ");
        sb.append("My name is Phuc.");
        System.out.println(sb);

        // insert - vi tri index, chuoi can chen vao
        sb.insert(3, "Bob and ");
        System.out.println(sb);

        //delete - xoa ki tu tu vi tri start den vi tri end
        sb.delete(6,16);
        System.out.println(sb);

        // length - tra ve do dai cua chuoi
        System.out.println(sb.length());

        // reserve - dao nguoc chuoi
        System.out.println(sb.reverse());


        String s = "Le Hoang Phuc la ky su Java va la em cua Le Hong Duc";
        // indexOf - Kiem tra vi tri chuoi can tim xuat hien dau tien cua ky tu hoac chuoi
        System.out.println(s.indexOf("Phuc"));

        // lastIndexOf - Kiem tra vi tri chuoi can tim xuat hien cuoi cung cua ky tu hoac chuoi
        System.out.println(s.lastIndexOf("Le"));

        // contains - Kiem tra chuoi con
        String s1 = ".mp3";
        String s2 = "videohay.mp3";
        // Kiem tra s2 co chua s1 khong
        boolean check = s2.contains(s1);
        if(check){
            System.out.println("Co " + s1 + " trong chuoi " + s2 );
        }
        else{
            System.out.println("Khong co trong chuoi");
        }

        // substring - Trich loc chuoi con tu chuoi ban dau
        String s3 = "Le Hoang Phuc";
        String s4 = s3.substring(3, 8);
        System.out.println(s3);
        System.out.println(s4);

        // replace - thay the toan bo chuoi old = chuoi new
        String s5 = "hoc, hoc nua, hoc mai";
        String s6 = s5.replace("hoc","ngu");
        System.out.println(s5);
        System.out.println(s6);
        // replaceFirst - thay the chuoi old ban dau = chuoi new
        String s7 = s5.replaceFirst("hoc", "ngu");
        System.out.println();
        System.out.println(s7);

        // trim() -  Xoa khoang trang thua trong dau chuoi va cuoi chuoi
        String s8 = "                 Xin chao ban     ";
        String s9 = s8.trim();
        System.out.println("TRIM");
        System.out.println(s8);
        System.out.println(s8.length());
        System.out.println(s9);
        System.out.println(s9.length());
        // Xoa toan bo trang o cuoi
        // cach 1: Bieu thuc chinh quy (redular expression)
        /*** " \s+ " -  dai dien cho nhieu khoang trang lien tiep
             " $ " - dai dien cho ket thuc chuoi
        ***/
        // " \s+$ - dai dien cho mot hoac nhieu khoang trang lien tiep truoc khi ket thuc dong
        System.out.println();
        String s10 = "    Le Hoang Phuc    ";
        String s11 = s10.replaceAll("\\s+$", "");
        System.out.println(s10);
        System.out.println(s10.length());
        System.out.println(s11);
        System.out.println(s11.length());

        System.out.println();
        // cach 2 - dung strip()
        String s12 = s10.stripLeading();
        System.out.println(s12);
        String s13 = s10.stripTrailing();
        System.out.println(s13);
        String s14 = s10.strip();
        System.out.println(s14);

        System.out.println();

        // compareTo - So sanh(bang nhau tra ve = 0/ lon hon tra ve > 0/ nho hon tra ve < 0 , compareToIgnoreCase - So sanh bo qua phan biet in hoa in thuong
        String s15 = "ABC12345";
        String s16 = "abc12345";
        // abc - ABC
        System.out.println(s16.compareTo(s15));
        System.out.println(s16.compareToIgnoreCase(s15));


        // split - tach chuoi
        String s17 = "Hello,wolrd!";
        String[] mang = s17.split(",");
        for(int i = 0; i < mang.length; i++){
            System.out.println(mang[i]);
        }

        // toUpperCase, toLowerCase
        String s18 = "LE hoaNg PhUc";
        String s19 = s18.toLowerCase();
        String s20 = s18.toUpperCase();
        System.out.println(s19);
        System.out.println(s20);

        System.out.println();
        // toCharArray - tach chuoi thanh tung ky tu, cho vao mang
        String s21 = "abcdefghi";
        System.out.println(s21);
        char[] arr = s21.toCharArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
