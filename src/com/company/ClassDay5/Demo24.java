package com.company.ClassDay5;

import java.util.TreeSet;

public class Demo24 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(65);
        tree.add(21);
        tree.add(-2);
        tree.add(19292);

        System.out.println(tree);
        for(int num : tree){
            System.out.println(num);
        }

        //pollFirst()
        //pollLast()

        System.out.println("Highest: " + tree.pollLast());
        System.out.println("Lowest: " + tree.pollFirst());
    }
}
