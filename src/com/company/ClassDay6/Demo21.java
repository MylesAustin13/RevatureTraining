package com.company.ClassDay6;

public class Demo21 {
    public static void main(String[] args) {
        //implicit conversion
        int a = 10;
        long b = a; //automatically converts the integer type into long type
        float c = b; //automatically converts the long type into float type

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
