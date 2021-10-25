package com.company.ClassDay4;

public class Demo14 {
    public static void main(String[] args) {

        StringBuffer test = new StringBuffer();
        test.append("Welcome to java class, have a nic day");
        System.out.println(test.length());
        System.out.println(test.capacity());

        //Empty String
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//16

        //16 chars
        sb.append("0123456789ABCDEF");
        System.out.println(sb.capacity()); //16

        //18 chars
        sb.append("sb");
        System.out.println(sb.capacity()); //34

        //34 chars
        sb.append("0123456789ABCDEF");
        System.out.println(sb.capacity()); //34

        //36 chars
        sb.append("sb");
        System.out.println(sb.capacity()); //70
    }
}
