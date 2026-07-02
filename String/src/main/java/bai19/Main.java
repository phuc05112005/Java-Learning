package bai19;

public class Main {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";

        int tinhTong = 0;
        int demSo = 0;

        String[] arr = str1.split(" ");
        for(String a : arr){
            System.out.println(a);
            try {
                int num = Integer.parseInt(a);
                demSo++;
                tinhTong += num;
            } catch(NumberFormatException e){

            }
        }

        // tinh trung binh
        double tb = (double) tinhTong/demSo;
        System.out.println("Tong cua cac so trong chuoi: " + tinhTong);
        System.out.println("Trung binh cong: " + tb);
    }
}
