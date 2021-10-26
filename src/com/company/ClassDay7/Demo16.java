package com.company.ClassDay7;

class Engine{

    public Engine(String type){
        System.out.println("Made the engine!");
    }
}

class Tire{
    public Tire(String type){
        System.out.println("Made a tire!");
    }
}

class Car{
    Engine engine;
    Tire tire;
    public Car(){
        //this.tire = new Tire();   //This code is tightly coupled! Rely on each other too much!
        //this.engine = new Engine();
        System.out.println("Car completed!");
    }

    public Car(Engine e, Tire t){
        engine = e;
        tire = t;
        System.out.println("Car completed");
    }
}

public class Demo16 {
    public static void main(String[] args) {
        //Car car = new Car();
    }
}
