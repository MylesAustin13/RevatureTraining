package com.company.ClassDay3;

class Calculation{
    public static void test(){
        System.out.println("1st method");
    }

    public static void test(int a){
        System.out.println("2nd method");
    }

    public static void test(String b){
        System.out.println("3rd method");
    }

    public static void test(int a, String b){
        System.out.println("4th method");
    }
    public static void test(String b, int a){
        System.out.println("5th method");
    }
    //Changing return type: not enough
    /*public int test(){
        return 10;
    }*/
}

public class Demo17 {
    public static void main(String[] args) {
        Calculation.test();
        Calculation.test(2);
        Calculation.test("AAA");
        Calculation.test(3,"B");
        Calculation.test("Ffgg", 241);
    }
}
