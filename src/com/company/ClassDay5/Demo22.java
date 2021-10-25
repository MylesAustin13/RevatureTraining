package com.company.ClassDay5;

import java.util.HashSet;
import java.util.Iterator;

public class Demo22 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Markiplier");
        set.add("Pally");
        set.add("Watt");
        set.add("Watt");
        set.add(null);
        set.add(null);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove
        set.remove("Pally");
        System.out.println(set);

        //removeAll,removeIf,clear, etc


    }
}
