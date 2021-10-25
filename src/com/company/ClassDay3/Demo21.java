package com.company.ClassDay3;

class Bike{
    public final void drive(){
        System.out.println("Schmooving");
    }
}

class Honda extends Bike{
    //can't override with final
    /*@Override
    public void drive(){
        System.out.println("Driving....");
    }*/
}

public class Demo21 {
    public static void main(String[] args) {

    }
}
