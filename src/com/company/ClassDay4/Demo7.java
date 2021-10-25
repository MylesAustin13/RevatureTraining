package com.company.ClassDay4;

public class Demo7 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = "Paul";

        //compareTo() returns lexicographical order
        // s1 > s2 = positive #
        // s1 < s2 = negative #
        // s1 ==s2 = 0

        System.out.println(s1.compareTo(s2)); //0, both are equal
        System.out.println(s1.compareTo(s3)); //-3, since M is 3 times lower than P
        System.out.println(s3.compareTo(s1)); //+3, since P is 3 times higher than M

    }
}
