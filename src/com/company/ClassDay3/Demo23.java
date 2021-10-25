package com.company.ClassDay3;

abstract class AnotherCalculator{

    //Non abstract
    public void addNumber(int num1, int num2){
        System.out.println("Sum: " + (num1 + num2));
    }
    public void subNumber(int num1, int num2){
        System.out.println(("Sub: " + (num1 - num2)));
    }

    //abstract
    public abstract void mulNumber(int a, int b);
    public abstract void divNumber(int x, int y);
}

class Output extends AnotherCalculator{

    @Override
    public void mulNumber(int a, int b) {
        System.out.println("Mul: " + (a * b));
    }

    @Override
    public void divNumber(int x, int y) {
        System.out.println(("Div: " + (x / y)));
    }
}

public class Demo23 {
    public static void main(String[] args) {
        Output obj = new Output();
        obj.addNumber(200,100);
        obj.subNumber(200,100);
        obj.mulNumber(200,100);
        obj.divNumber(200,100);
    }
}
