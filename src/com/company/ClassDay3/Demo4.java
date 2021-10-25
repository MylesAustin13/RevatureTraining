package com.company.ClassDay3;

class Car{
    public String name;
    public String brand;
    public String color;
    public String engineType;
    public int price;

    public Car(String name, String brand, String color, String engineType, int price){
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.price = price;

    }

    public Car(Car car){
        if(car == null){
            safetyCheck();
        }
        else{
            this.name = car.name;
            this.brand = car.brand;
            this.color = car.color;
            this.engineType = car.engineType;
            this.price = car.price;
        }

    }

    public Car(Car car, String name){
        this.name = name;
        this.brand = car.brand;
        this.color = car.color;
        this.engineType = car.engineType;
        this.price = car.price;
    }

    public Car(Car car, int price){
        this.name = car.name;
        this.brand = car.brand;
        this.color = car.color;
        this.engineType = car.engineType;
        this.price = price;
    }
    public void safetyCheck(){
        System.out.println("That was null!");
        this.name = "";
        this.brand = "";
        this.color = "";
        this.engineType = "";
        this.price = 0;
    }

    public void displayCar(){
        System.out.println("Car: " + name);
        System.out.println("    Brand: " + brand);
        System.out.println("    Color: " + color);
        System.out.println("    Engine Type: " + engineType);
        System.out.println("    Price: $" + price);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Car car1 = new Car("Greg", "Pepsi", "Clear","Veggie Oil",6);
        Car car2 = new Car(car1);
        Car car3 = new Car(car1, 222);
        Car car4 = new Car(car1, "Heffley");
        car1.displayCar();
        car2.displayCar();
        car3.displayCar();
        car4.displayCar();
    }
}
