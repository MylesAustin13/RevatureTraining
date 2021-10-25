package com.company.ClassDay3;

class A3{
    static int x;


    static{
        x = 20;
        if(x > 10){
            System.out.println("I can do conditionals!");
        }
    }
}

public class Demo15 {

    public static void main(String[] args) {
        A3 a = new A3();
    }
}
