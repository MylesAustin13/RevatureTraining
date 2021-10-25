package com.company.ClassDay3;

class Papa{
    public Papa(){
        System.out.println("Parent constructor called!");
    }

    public void test1(){
        System.out.println("Parent method used!");
    }
}

class Child extends Papa{
    public Child(){
        System.out.println("Child constructor called!");
    }

    public void test2(){
        System.out.println("Child method used!");
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Papa parent = new Papa();
        parent.test1();
        //parent.test2(); CHILD METHOD NOT ACCESSIBLE TO PARENT
        Child child = new Child();
        child.test1();
        child.test2();
    }
}
