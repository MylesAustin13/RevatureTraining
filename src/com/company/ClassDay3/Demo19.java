package com.company.ClassDay3;

class Bank{
    public int getRateOfInterest(){
        return 2;
    }
}

class BankA extends Bank{
    public int getRateOfInterest(){
        return 7;
    }
}

class BankB extends Bank{
    public int getRateOfInterest(){
        return 6;
    }
}
public class Demo19 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();

        System.out.println(bankA.getRateOfInterest());
        System.out.println(bankB.getRateOfInterest());
    }
}
