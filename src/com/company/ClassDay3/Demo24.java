package com.company.ClassDay3;

abstract class Shape{
    public double width;
    public double height;
    public double radius;
    public final float pie = 3.14f;

    public abstract void getArea();
}

class Rectangle extends Shape{
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void draw(){
        System.out.println("Rectangle drawing....");
    }

    @Override
    public void getArea(){
        System.out.println("Area: " + (width * height));
    }
}

class Circle extends Shape{
    public Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Circle drawing...");
    }

    @Override
    public void getArea(){
        System.out.println("Area: " + (radius * radius * pie));
    }
}

public class Demo24 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(22.3,4);
        Circle circ = new Circle(5);

        rect.draw();
        rect.getArea();
        circ.draw();
        circ.getArea();
    }
}
