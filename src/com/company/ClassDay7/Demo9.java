package com.company.ClassDay7;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}
class Cone{
    void draw() {
        System.out.println("Drawing a Cone...");
    }
}
class Output{
    //create a method the accepts only children of Shape
    public static void drawShape(List<? extends Shape> list){
        for (Shape shape : list) {
            shape.draw(); //calling method of Shape by child class instance
        }
    }
}
public class Demo9 {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Output.drawShape(rectangleList);
        Output.drawShape(circleList);
        //Output.drawShape(coneList);  //Error!
    }
}
