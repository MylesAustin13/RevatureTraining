package com.company.ClassDay3;

class Car2{

    public final int speed_limit = 60;

    public void drive(){
        System.out.println("Car is driving at speed of " + speed_limit);
    }

}

public class Demo20 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.drive();
    }
}
