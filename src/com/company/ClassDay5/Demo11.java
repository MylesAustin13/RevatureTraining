package com.company.ClassDay5;

public class Demo11 {
    public static void main(String[] args) {
        try{
            print1();
        } catch (StackOverflowError ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void print1(){
        print2();
    }

    public static void print2(){
        print1();
    }
}
