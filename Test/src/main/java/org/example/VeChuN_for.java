package org.example;

public class VeChuN_for {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i+""+j+"\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= n; j++){
                if(j == 1 || j == 7 || j == i){
                    System.out.print(i+""+j+"\t");
                }
                else{
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= n; j++){
                if(j == 1 || j == 7 || i == 1 || i == 7){
                    System.out.print(i+""+j+"\t");
                }
                else{
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+""+j+"\t");
            }
            System.out.println();
        }
    }
}
