package com.company.ClassDay3;

interface Drawable2{
    void draw();
    static void area(){
        System.out.println("Getting area");
    }
}

class Circ implements Drawable2{

    @Override
    public void draw() {
        System.out.println("DRAW");
    }
}

public class Demo30 {
    public static void main(String[] args) {
        Circ c = new Circ();
        c.draw();
        Drawable2.area();
    }
}
