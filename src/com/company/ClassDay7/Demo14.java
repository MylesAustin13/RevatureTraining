package com.company.ClassDay7;

//SINGLETON DESIGN PATTERN - CREATION
class Calculation{
    private static Calculation instance = null;
    public static int count = 0;
    public static int attempts = 0;

    private int special_id = 0;

    private Calculation(){
        count++;
        System.out.println("Count: " + count);
        System.out.println("Constructor called!");
    }

    public static Calculation getInstance(){
        attempts++;
        if(instance == null){
            instance = new Calculation();
        }
        return instance;
    }

    public void setID(int id){
        special_id = id;
    }

    public int getID(){
        return special_id;
    }

}

public class Demo14 {
    public static void main(String[] args) {

        Calculation cal1 = Calculation.getInstance();
        Calculation cal2 = Calculation.getInstance();
        Calculation cal3 = Calculation.getInstance();

        System.out.println("Attempts to create a new instance: " + Calculation.attempts);

        //All vars point to the same instance!
        System.out.println(cal3.getID());
        cal1.setID(123123);
        System.out.println(cal2.getID());
        System.out.println(cal3.getID());

    }

}
