import java.util.Scanner;

public class mang2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong cot: ");
        int cot = sc.nextInt();
        System.out.print("Nhap vao so luong hang: ");
        int hang = sc.nextInt();

        int [][] matran = new int[cot][hang];
        for(int i = 0; i<cot; i++){
            for(int j = 0; j<hang; j++){
                System.out.print("Nhap phan tu cot [" + i + "], hang [" + j + "]");
                matran[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<cot; i++){
            for(int j = 0; j<hang; j++){
                System.out.print(matran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
