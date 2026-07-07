package bai19;

public class Main {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";

        int sum = 0;
        int count = 0;
        String[] words = str1.split(" ");
        for(int i = 0; i < words.length; i++){
            try{
                int num = Integer.parseInt(words[i]);
                sum += num;
                count++;
            } catch (NumberFormatException e) {

            }
        }

        System.out.println("sum = " + sum);
        double mean = (double) sum/count;
        System.out.println("mean = " + mean);
    }
}
