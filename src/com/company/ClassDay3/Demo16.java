package com.company.ClassDay3;



public class Demo16 {
    public static void main(String[] args) {
        //Method Overloading Example
        String message = "Hello World";
        int ind = message.indexOf('o');
        System.out.println(ind);
        int ind2 = message.indexOf('o',5);
        System.out.println(ind2);
        int ind3 = message.indexOf("ll");
        System.out.println(ind3);
    }
}
