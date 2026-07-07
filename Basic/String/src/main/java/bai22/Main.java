package bai22;

public class Main {
    public static void main(String[] args) {
        String a = "tôi chăm học tôi chịu khó tôi đẹp trai";
        String[] word = a.split(" ");

        int count = 0;
        for(String tu : word){
            if(tu.equals("tôi")){
                count++;
            }
        }

        System.out.println("tong so cac tu can tim: " + count);
    }
}
