package com.company.ClassDay3;

abstract class Test10{
    public abstract void display1();

}

abstract class Test11 extends Test10{
    public abstract void display2();

}

abstract class Test12 extends Test11{
    public abstract void display3();
}

class Output2 extends Test12{

    @Override
    public void display1() {
        System.out.println("a");
    }

    @Override
    public void display2() {
        System.out.println("b");
    }

    @Override
    public void display3() {
        System.out.println("c");
    }
}


public class Demo25 {
    public static void main(String[] args) {
        Output2 ou = new Output2();
        ou.display1();
        ou.display2();
        ou.display3();
    }
}
