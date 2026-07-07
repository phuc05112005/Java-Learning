package bai32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        System.out.println(lst);
        ArrayList<Integer> lstCopy = new ArrayList<>(lst);

        Collections.sort(lstCopy);
        System.out.println(lstCopy);
        System.out.println("Phan tu lon thu 2 trong list: " + lstCopy.get(lstCopy.size()-2) + ". Vi tri index: " + lst.indexOf(lstCopy.get(lstCopy.size()-2)));
        System.out.println("Phan tu nho thu 2 trong list: " + lstCopy.get(1) + ". Vi tri index: " + lst.indexOf(lstCopy.get(1)));

    }
}
