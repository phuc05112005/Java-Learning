import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
         int[] mang1 = {1,2,3};
         int[] mang2 = mang1;
         int[] mang3 = mang1.clone();
         int[] mang4 = new int[mang1.length];
         System.arraycopy(mang1,0, mang4, 0, mang1.length);

        mang2[0] = 100;
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang2));

        mang3[0] = 50;
        System.out.println(Arrays.toString(mang3));

        System.out.println(Arrays.toString(mang4));

    }
}
