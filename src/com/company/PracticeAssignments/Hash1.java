package com.company.PracticeAssignments;

import java.util.HashSet;

public class Hash1 {
    public static void main(String[] args) {
        HashSet<String> hashbrown = new HashSet<>();
        hashbrown.add("Pizza");
        hashbrown.add("French Fries");
        hashbrown.add("Burger");
        hashbrown.add("Calzone");
        hashbrown.add("Pie");
        System.out.println(hashbrown);
        System.out.println("---------------");

        //Append to end
        System.out.println("Append to end");
        hashbrown.add("Noodles"); //Probably unstable
        System.out.println(hashbrown);
        System.out.println("---------------");

        //Iterate through all
        for (String s : hashbrown) {
            System.out.println(s);
        }
        System.out.println("---------------");

        //check number
        System.out.println(hashbrown.size());
        System.out.println("---------------");
        //empty set
        hashbrown.clear();
        System.out.println(hashbrown);

    }
}
