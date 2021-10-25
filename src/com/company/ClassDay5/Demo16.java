package com.company.ClassDay5;

import java.util.ArrayList;
import java.util.Collections;



public class Demo16 {
    public static void main(String[] args) {
        ArrayList<String > colors = new ArrayList<>();

        colors.add("Yellow");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        //Pre sort
        System.out.println("Before Sorting: ");
        for(String c : colors){
            System.out.println(c);
        }
        //sort
        Collections.sort(colors);

        //post sort
        System.out.println("After Sorting: ");
        for(String c : colors){
            System.out.println(c);
        }

        //List of numbers
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(6);
        nums.add(4);
        nums.add(3);


        //before sorting
        System.out.println("Before sorting: ");
        for(int num : nums){
            System.out.println(num);
        }

        //sort
        Collections.sort(nums);

        //after sort
        System.out.println("After sorting: ");
        for (int num : nums) {
            System.out.println(num);
        }

        //reverse
        Collections.reverse(nums);
        //after sort
        System.out.println("After reversing: ");
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
