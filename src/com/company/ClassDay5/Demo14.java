package com.company.ClassDay5;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo14 {
    public static void main(String[] args) {
        ArrayList<String> my_list = new ArrayList();

        my_list.add("Mike");
//      my_list.add(10);    ARRAYLIST IS TYPE SAFE: ONE DATA TYPE PER LIST
        my_list.add("Joe");
        my_list.add("Tom");

        System.out.println(my_list);

        //iterator

        Iterator iterator = my_list.iterator();

        //hasNext() will check if iterator has the element
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //foreach loop
        for (String s : my_list) {

            System.out.println(s);
        }

    }
}
