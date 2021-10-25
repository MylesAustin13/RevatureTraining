package com.company.ClassDay3;

class Calculator{
    int a = 10;
    int b = 20;

    public Calculator(){
        System.out.println("Parameterless constructor");
    }

    public Calculator(int x, int y){
        this.a = x;
        this.b = y;
        System.out.println("Parameterized constructor");
    }

    public void addNumber(){
        System.out.println("Sum: " + (this.a + this.b));
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addNumber();

        Calculator cal2 = new Calculator(100, 200);
        cal2.addNumber();
    }
}
