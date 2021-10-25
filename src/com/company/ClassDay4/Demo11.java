package com.company.ClassDay4;

import java.util.Arrays;

public class Demo11 {
    public static void main(String[] args) {
        String message = "Hello, Welcome to Chili's";
        String email = "mark@zuck.com";

        String[] res = email.split("@");
        String[] result = message.split(",");
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(result));
    }
}
