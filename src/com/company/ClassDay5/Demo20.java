package com.company.ClassDay5;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo20 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Lark");
        names.add("Billy Bob");
        names.add("Dwight");

        Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
