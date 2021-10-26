package com.company.ClassDay7;

interface DrawSomething{
    void draw();
}

class Output2 implements DrawSomething{

    @Override
    public void draw() {
        System.out.println("Rudy! You gotta draw something!");
    }
}


public class Demo10 {
    public static void main(String[] args) {
        //without lambda
        Output2 obj = new Output2();
        obj.draw();

        //without lambda
        DrawSomething d = new DrawSomething() {
            @Override
            public void draw() {
                System.out.println("Drawing something cool!");
            }
        };
        d.draw();

        //with lambda
        DrawSomething d2 = () -> {
            System.out.println("Drawing with a lambda function");
        };
        d2.draw();


    }
}
