package com.company.ClassDay2;

public class Demo10 {
    public static void main(String[] args) {
        int stars = 10;
        for(int i=1;i<=10;i++){
            stars = 10 - i;
            for(int j=1;j<=10; j++){
                if(stars > 0 && j >= i && j <= 10 - i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
