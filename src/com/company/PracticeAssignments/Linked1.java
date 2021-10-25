package com.company.PracticeAssignments;

import java.util.Iterator;
import java.util.LinkedList;

class ListCheck{
    public static void listLoop(int start_index, LinkedList<String> list){
        Iterator iterator = list.iterator();

        for(int i = 0; i < start_index; i++){ //Move the head to the starting position
            iterator.next();
        }

        //Actually loop now
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}

public class Linked1 {
    public static void main(String[] args) {
        LinkedList<String> str_list = new LinkedList<String>();
        str_list.add("First Item");
        str_list.add("Second Item");
        str_list.add("Third Item");
        str_list.add("Fourth Item");
        str_list.add("Fifth Item"); //Also appends to end btw
        System.out.println(str_list);
        System.out.println("-------------------------");

        //Append to end of list, but more explicitly i guess
        str_list.addLast("Last Item");
        System.out.println("Appending new item: ");
        System.out.println(str_list);
        System.out.println("--------------------------");
        System.out.println("All elements: ");

        //Iterate Through all elements
        for (String s : str_list) {
            System.out.println(s);
        }
        System.out.println("--------------------------");

        //Iterate through elements starting at position
        System.out.println("Iterate starting at index 2");
        ListCheck.listLoop(2,str_list);
        System.out.println("--------------------------");

        //Iterate in reverse
        System.out.println("All elements backward");
        Iterator it = str_list.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------------");

        //Add element to spot
        System.out.println("Adding element to middle.");
        str_list.add(str_list.size() / 2, "Middle-ish item");
        System.out.println(str_list);

    }
}
