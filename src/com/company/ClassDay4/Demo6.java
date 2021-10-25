package com.company.ClassDay4;

public class Demo6 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");

        // == checks if references match, NOT content

        System.out.println(s1 == s2); //TRUE - Refer to the same instance
        System.out.println(s1 == s3); //FALSE - s3 instance is in heap, not constant pool
    }
}
