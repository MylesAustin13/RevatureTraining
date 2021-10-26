package com.company.ClassDay7;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(3);
        nums.add(5);

        System.out.println("Pre sort:");
        for (Integer num : nums) {
            System.out.println(num);
        }

        Collections.sort(nums);
        System.out.println("Post sort:");
        for (Integer num : nums) {
            System.out.println(num);
        }

        Collections.reverse(nums);
        System.out.println("Reverse Sort: ");
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
