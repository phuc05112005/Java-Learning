import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap vao so phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = rd.nextInt(100);
            System.out.println("Phan tu ngau nhien thu " + i + ": " + arr[i]) ;
        }
        System.out.println("Cac gia tri trong mang: " + Arrays.toString(arr));


        // Dao nguoc mang
        for(int i = 0, j = arr.length - 1; i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Mang sau khi dao nguoc; "+ Arrays.toString(arr));

        // Sap xep mang tang dan
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(arr));

        // Tinh tong cac phan tu trong mang
        int tong = 0;
        for(int c : arr){
            tong += c;
        }
        System.out.println("Tong cac phan tu trong mang: "+ tong);

        // Kiem tra so co ton tai trong mang ko
        boolean ktra = false;
        int viTri = 0;
        System.out.print("Nhap so can kiem tra: ");
        int num = sc.nextInt();
        for(int i = 0; i<arr.length;i++){
            if(num == arr[i]){
                ktra = true;
                viTri = i;
                break;
            }
        }
        if(ktra){
            System.out.println("Phan tu co ton tai trong mang, vi tri thu: " + viTri);
        }
        else{
            System.out.println("Phan tu khong ton tai trong mang");
        }
    }
}
