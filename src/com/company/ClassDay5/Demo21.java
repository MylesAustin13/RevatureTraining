package com.company.ClassDay5;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo21 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Lark");
        names.add("Billy Bob");
        names.add("Dwight");
        System.out.println(names);

        //adding elements at an index
        names.add(0, "Kirby");
        System.out.println(names);

        //adding second list
        LinkedList<String> more_names = new LinkedList<>();
        more_names.add("Chowder");
        more_names.add("Schnitzel");

        names.addAll(more_names);
        System.out.println(names);

        //addFirst
        names.addFirst("First");
        System.out.println(names);

        //addLast
        names.addLast("Last");
        System.out.println(names);

        //remove/removeFirst/removeLast/removeFirstOccurrence/removeLastOccurrence
        names.add("Chowder");
        names.add("Dwight");
        System.out.println(names);

        names.removeFirstOccurrence("Chowder");
        names.removeLastOccurrence("Dwight");
        System.out.println(names);

        //reverse elements
        System.out.println("---------------");
        System.out.println("original: ");
        System.out.println(names);

        Iterator iterator = names.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(int i = names.size() - 1; i >= 0; i--){
            System.out.println(names.get(i));
        }

    }
}
