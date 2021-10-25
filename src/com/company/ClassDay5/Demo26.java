package com.company.ClassDay5;

import java.util.PriorityQueue;

public class Demo26 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue();
        pq.add("Gleb");
        pq.add("Dingle");
        pq.add("WeebleWobble");
        pq.add("DIO");

        for(String name : pq){
            System.out.println(name);
        }
        System.out.println("-----------------------Ele");
        System.out.println("Head: " + pq.element());
        for(String name : pq){
            System.out.println(name);
        }
        System.out.println("-----------------------Peek");
        System.out.println("Head: " + pq.peek());
        for(String name : pq){
            System.out.println(name);
        }
        System.out.println("-----------------------Rem");
        System.out.println("Head: " + pq.remove());
        for(String name : pq){
            System.out.println(name);
        }
        System.out.println("-----------------------Poll");
        System.out.println("Head: " + pq.poll());
        for(String name : pq){
            System.out.println(name);
        }
    }
}
