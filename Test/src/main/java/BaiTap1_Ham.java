import java.util.Scanner;

public class BaiTap1_Ham {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap phep tinh ( + / - ): ");
        String phepTinh = sc.next();
        switch (phepTinh){
            case "+":
            {
                System.out.println(Cong(a,b));
                break;
            }
            case "-":
            {
                System.out.println(Tru(a,b));
                break;
            }

        }

    }

    public static double Cong(double a, double b){
        return a + b;
    }

    public static double Tru(double a, double b){
        return a - b;
    }
}
