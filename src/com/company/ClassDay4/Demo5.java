package com.company.ClassDay4;



public class Demo5 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        String s4 = "Paul";
        String s5 = "MARK";

        // equals() compares 2 strings based on their content
        //Any mismatched characters returns false, otherwise true
        System.out.println(s1.equals(s2)); //Values match
        System.out.println(s1.equals(s3)); //Values match
        System.out.println(s1.equals(s4)); //Values do not match
        System.out.println(s1.equals(s5)); //Values do not match, equals is case-sensitive
        System.out.println(s1.equalsIgnoreCase(s5)); //Values match if we ignore case sensitivity
    }
}
