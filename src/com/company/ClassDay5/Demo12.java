package com.company.ClassDay5;

import java.io.BufferedReader;

public class Demo12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        try{
            c = a/b;
        } catch (ArithmeticException ex){
            System.out.println("ARITH");
        } catch (NullPointerException | NumberFormatException e){
            System.out.println("NULL/NUMB");
        } catch(Exception ex){
            System.out.println("OTHER");
        }
    }
}
