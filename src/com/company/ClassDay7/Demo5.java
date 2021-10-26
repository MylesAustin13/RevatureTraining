package com.company.ClassDay7;

class Calculator<T>{
//    public boolean areEqual(int a, int b){
//        if(a  ==  b){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
    public boolean areEqual(T a, T b){

        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }


}

public class Demo5 {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        boolean result = calc.areEqual(10.22,20);

        Calculator<String> calculator = new Calculator<>();
        boolean result = calculator.areEqual("A","B");

        Calculator<Integer> c = new Calculator<>();
        result = c.areEqual(23,33);
        if(result)
            System.out.println("Are equal!");
        else
            System.out.println("Not equal...");
    }
}
