package com.company.ClassDay2;

public class Demo15 {
    public static void main(String[] args) {
        for(int i = 1; i<=10;i++){
            if(i == 5){
                continue; //Skip the rest of this iteration
            }
            System.out.println(i);
        }
    }
}
