package com.company.ClassDay6;

public class Demo24 {
    public static void main(String[] args) {
        //converting primitive to wrapper

        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 12.3f;
        double f = 12.23;
        char g = 'a';
        boolean h = true;

        //Autoboxing: converting primitive to object
        Byte byteObj = a;
        Short shortObj = b;

        // unboxing: converting object into primitive
        byte byteValue = byteObj;
        short shortValue = shortObj;
    }
}
