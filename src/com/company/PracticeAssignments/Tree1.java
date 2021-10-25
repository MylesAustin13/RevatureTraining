package com.company.PracticeAssignments;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree1 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");
        System.out.println(colors);
        System.out.println("-----------------");

        //Iterate through
        System.out.println("All elements");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("-----------------");

        //Merge tree
        TreeSet<String> other_colors = new TreeSet<>();
        other_colors.add("Pink");
        other_colors.add("Periwinkle");
        other_colors.add("Purple");
        System.out.println("New TreeSet: " + other_colors);
        colors.addAll(other_colors);
        System.out.println("Merged TreeSet: " + colors);
        System.out.println("-------------------------------");

        //Reverse
        Iterator it = colors.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------------------");

        //First and last
        System.out.println("First: " + colors.first());
        System.out.println("Last: " + colors.last());
    }
}
