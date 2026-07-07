package interfaces;

public class Main {
    public static void main(String[] args) {
//        MayTinhCasioFX500 may1 = new MayTinhCasioFX500();
//        System.out.println(may1.cong(252,73));
//
//        System.out.println("Test");
//        double[] arr = new double[]{1,2,4,6,21,1,124,41,4,4,41,54,2,13,7};
//        SapXepChen sapXepChen = new SapXepChen();
//        SapXepChon sapXepChon = new SapXepChon();
//
//        sapXepChen.sapXepTang(arr);
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " | ");
//        }
//        System.out.println();
//
//        sapXepChon.sapXepTang(arr);
//        for(int i = 0; i< arr.length; i++){
//            System.out.print(arr[i] + " | ");
//        }

        System.out.println("------");
        PhanMemMayTinhBoTui pm1 = new PhanMemMayTinhBoTui();
        double[] arr1 = new double[]{1,34,5,6,7,72,2};
        pm1.sapXepGiam(arr1);
        for(int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i] + " | ");
        }
    }
}
