package com.company.ClassDay4;

public class Demo13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        //append
        sb.append("World");
        System.out.println(sb);

        //insert
        sb.insert(0, "World");
        System.out.println(sb);

        //replace
        sb.replace(0,3,"H");
        System.out.println(sb);

        //delete
        sb.delete(3,4);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);
    }


}
