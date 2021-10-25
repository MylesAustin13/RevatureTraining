package com.company.ClassDay3;

class Test{
    public Test(){
        System.out.println("First");
    }

    public Test(int x){
        System.out.println("Second");
    }

    public Test(String s){
        System.out.println("Third");
    }

    public Test(int a, String s){
        System.out.println("Fourth");
    }

    public Test(String s, int a){
        System.out.println("Fifth");
    }

}

public class Demo3 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(2);
        Test t3 = new Test("Hello!");
        Test t4 = new Test(2, "Bye");
        Test t5 = new Test("Maybe", 44);
    }
}
