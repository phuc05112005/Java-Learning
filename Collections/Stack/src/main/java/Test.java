import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.Stack;

// stackChuoi.push("gia tri") => Dua gia tri vao stack
// stackChuoi.pop() => Lay gia tri ra, xoa khoi stack
// stack.peek() = Lay gia tri ra, nhung khong xoa khoi stack
// stack.clear() => Xoa tat ca phan tu trong stack
// stack.size() => do lon cua stack
// stack.contains("gia ttri") => Xac dinh gia tri co ton tai trong stack khong 

public class Test {
    public static void main(String[] args) {
        // Dao nguoc chuoi
        Stack<String> stackChuoi = new Stack<String>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();
        for(int i = 0; i<s.length(); i++){
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc: ");
        for(int i = 0; i<s.length(); i++){
            System.out.print(stackChuoi.pop());
        }
        System.out.println();

        //  Chuyen tu he so thap phan sang nhi phan
        Stack<Integer> stackNP = new Stack<Integer>();
        System.out.print("Nhap so:");
        int num = sc.nextInt();
        while(num > 0){
            int soDu = num%2;
            stackNP.push(soDu);
            num = num / 2;
        }

        int n = stackNP.size();
        for(int i = 0; i< n; i++){
            System.out.print(stackNP.pop());
        }
    }
}
