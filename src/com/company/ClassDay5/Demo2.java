package com.company.ClassDay5;

public class Demo2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 0;
        try{
            c = a / b;
        }
        catch (ArithmeticException ex){ //Order matters! Exceptions are caught only once.
            System.out.println("Invalid value for b");
        }
        catch( NumberFormatException ex){ //Error if a more general exception catcher appears before a more specific one
            System.out.println("Formatting Exception");
        }
        catch(Exception ex){ //This is the super class, good if you don't know which specific exception
            System.out.println("There was an exception!");
        }
        System.out.println(c);

    }
}
