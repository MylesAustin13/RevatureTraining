package com.company.ClassDay7;

import java.util.ArrayList;
import java.util.List;

public class Demo12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pete");
        list.add("Marvin");
        list.add("Claudette");

        list.forEach((name) -> System.out.println(name));
    }
}
