package com.company.ClassDay3;

class Calculator2{

    // non static method
    public void addNumber(int num1, int num2){
        System.out.println(num1 + num2);
    }

    //static method
    public static void subNumber(int num1, int num2){
        System.out.println((num1 - num2));
    }
}


public class Demo12 {
    public static void main(String[] args) {
        Calculator2 c = new Calculator2();
        c.addNumber(1, 33);
        Calculator2.subNumber(12,3);
    }
}
