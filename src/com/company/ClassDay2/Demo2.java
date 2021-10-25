package com.company.ClassDay2;

class Demo1{
    static int not_secret = 333;
    int secret = 22;

}

public class Demo2 {
    static int z = 100; //Static variable (Cannot be local variable)
    int x = 10; //Instance variable

    public void addNumber(){
        int a = 10; //Local variable
        int b = 20; //Local variable

    }

    public void foo(){
        //Cannot access a or b.
    }

    public static void main(String[] args) {
        Demo1 test_obj = new Demo1();
        int a = 30;
        int b = 20;
        int c = 10;
        boolean d = true;
        boolean e = false;

        System.out.println(a + b); //50
        System.out.println(a - b); //10
        System.out.println(a * b); //600
        System.out.println(a / b); //1

        System.out.println(a > b); //true
        System.out.println(a > b && a > c); //true
        System.out.println(a > b && a < b); //false
        System.out.println(a > b || a < c); //true

        int max = (a > b) ? a : b; //Ternary operator
        System.out.println(max);

        System.out.println(Demo1.not_secret);
        System.out.println(test_obj.secret);

    }
}
