package com.company.ClassDay3;

interface Drawable{
    void draw();
    default void print(){
        System.out.println("printing");
    }
}

class Rect implements Drawable{

    @Override
    public void draw() {

    }
}

public class Demo29 {
    public static void main(String[] args) {
        Rect rec = new Rect();
        rec.draw();
        rec.print();
    }
}
