package overloading;

public class Main {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.timMin(5,10));
        System.out.println(mm.timMin(5.0,10.0));
        System.out.println();
        System.out.println(mm.tinhTong(5,15));

        double[] arr = new double[]{1,2,3,4,5};
        System.out.println(mm.tinhTong(arr));
    }
}
