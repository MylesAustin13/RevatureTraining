package com.company.ClassDay4;



public class Demo3 {
    public static void main(String[] args) {
        String s1 = "Hello"; //Creating String using a java literal

        char ch[] = {'H','e','l','l','o'};
        String s2 = new String(ch); //Converting a char array to String

        String s3 = new String("World"); //Creating a String using 'new' keyword

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
