import java.util.Scanner;

public class ViDu_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Nhap vao chuoi: ");
        s = sc.nextLine();


        // length - Kiem tra do dai cua chuoi
        System.out.println(s.length());


        // charAt - Lay ra ki tu tai vi tri
        for(int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        // getChars
        char[] arr = new char[10];
        s.getChars(2,5,arr,0);
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }

//        // getBytes
//        byte[] arrbytes = s.getBytes();
//        for(int i = 0; i< arr.length; i++){
//            System.out.println(arrbytes[i]);
//        }


        // regionMatches - So sanh 1 doan
        String r1 = "0908178656";
        String r2 = "0908138456";
        boolean check = r1.regionMatches(0,r2,0,4);
        System.out.println(check);


        // startWith - Kiem tra chuoi bat dau
        String sdt = "0775989566";
        System.out.println(sdt.startsWith("077"));

        // endWith - Kiem tra chuoi ket thuc
        String file1 = "abc.JPG";
        String file2 = "xyz.PDF";
        if(file1.endsWith(".JPG")){
            System.out.println("File 1 la hinh anh");
        } else if(file1.endsWith(".PDF")){
            System.out.println("File 1 la file PDF");
        }


        // indexOf
        String s1 = "Xin chao, toi la abc sinh nam 123. Xin chao tam biet";
        String s2 = "Xin chao";
        System.out.println(s1.indexOf(s2, 5));

        // lastIndexOf - Kiem tu phai sang trai
        System.out.println(s1.lastIndexOf(s2));




        // concat - Noi chuoi
        String s3 = "Le Hoang ";
        String s4 = "Phuc";
        System.out.println(s3.concat(s4));
    }
}
