package com.company.ClassDay5;

public class Demo8 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws Exception{
        doSomethingElse();
    }
    public static void doSomethingElse() throws Exception{
        doAnotherThing();
    }
    public static void doAnotherThing() throws Exception{
        throw new Exception();
    }
}
