package com.company.ClassDay3;

interface Foo{
    public String name = "Dean"; //Field is PUBLIC, STATIC, FINAL by default

    default void bar() {
        display();
        System.out.println("I displayed!");
    }
    private void display(){
        System.out.println("Do a flip");
    }
}

class Foop implements Foo{

}

public class Demo32 {
    public static void main(String[] args) {
        Foop f = new Foop();
        f.bar();
        System.out.println(Foo.name);
    }
}
