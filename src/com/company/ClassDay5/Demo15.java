package com.company.ClassDay5;

import java.util.ArrayList;

public class Demo15 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joseph Mama");
        names.add("Phil Lipp");
        names.add("Petemann Griff");

        //get
        System.out.println(names.get(1)); //Phil Lipp

        //set
        names.set(1, "Iggy");

        for (String s : names) {
            System.out.println(s);
        }

    }
}
