package com.company.ClassDay6;

import java.io.File;

public class Demo15 {
    public static void main(String[] args) {
        File file = new File("db");
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
    }
}
