package binarySearch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{5,7,2,8,4,8,1,5};
        int[] b = new int[15];

        System.out.println(Arrays.toString(a));

        // Ham sap xep tang dan
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // Sap xep giam dan
//        for(int i = 0, j = a.length -1; i<j; i++, j--){
//            int temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//        }
//        System.out.println(Arrays.toString(a));

        // Ham tim kiem
        System.out.println(Arrays.binarySearch(a,4));
    }
}
