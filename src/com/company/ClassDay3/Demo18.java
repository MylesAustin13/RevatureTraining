package com.company.ClassDay3;

class Parent2{
    public void greeting(String name){
        System.out.println("Welcome, " + name + ".");
    }
}

class Child2 extends Parent2{
    public void greeting(String name){
        System.out.println("Howdy, " + name+ "!");

    }
}

public class Demo18 {
    public static void main(String[] args) {
        Child2 child = new Child2();
        child.greeting("Peeves");
    }
}
