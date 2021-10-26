package com.company.ClassDay7;

interface IDisplay{
    String message(String str);
}

public class Demo13 {
    public static void main(String[] args) {
        IDisplay display = (message) -> {
            String str1 = "Hello ";
            String str2 = message;
            String str3 = ", how are you?";

            return str1 + str2 + str3;
        };
        System.out.println(display.message("Jimmy"));
    }
}
