package com.company.ClassDay7;

//FACTORY DESIGN PATTERN - CREATION
interface ICar{
    void getCarModel();
    void getCarColor();

}

class Audi implements ICar{

    @Override
    public void getCarModel() {
        System.out.println("Small?");
    }

    @Override
    public void getCarColor() {
        System.out.println("Blurple");
    }
}

class BMW implements ICar{

    @Override
    public void getCarModel() {
        System.out.println("Big?");
    }

    @Override
    public void getCarColor() {
        System.out.println("Clear");
    }
}

class Civic implements ICar{
    @Override
    public void getCarModel() {
        System.out.println("Normal :)");
    }

    @Override
    public void getCarColor() {
        System.out.println("Aquamarine");
    }
}


class CarFactory{
    public static ICar getCarInstance(int id){
        switch (id){
            case 1:
                return new Audi();
            case 2:
                return new BMW();
            case 3:
                return new Civic();
            default:
                return null;
        }
    }

}


public class Demo15 {
    public static void main(String[] args) { //IMPORTANT TO DECOUPLE LOGIC FROM MAIN

        //PRODUCING
        Audi car1 = new Audi(); //Risky, tightly coupled
        BMW car2 = new BMW();  //Especially if the constructor needs other stuff

        //Let Factory produce instead
        ICar carA = CarFactory.getCarInstance(1);
        ICar carB = CarFactory.getCarInstance(2);

        //Simpler to add class and upgrade factory, than add class and have consumer act
        ICar carC = CarFactory.getCarInstance(3);


        //CONSUMING
        carA.getCarModel();
        carA.getCarColor();
        carB.getCarModel();
        carB.getCarColor();
        carC.getCarModel();
        carC.getCarColor();
    }
}
