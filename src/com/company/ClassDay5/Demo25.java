package com.company.ClassDay5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Demo25 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("Marky");
        dq.add("Paul");

        for(String name: dq){
            System.out.println(name);
        }
    }
}
