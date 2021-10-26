package com.company.ClassDay7;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("C");
        letters.add("a");
        letters.add("B");
        letters.add("D");
        letters.add("L");
        letters.add("z");
        letters.add("C");

        System.out.println("Pre-Sort: ");
        for (String letter : letters) {
            System.out.println(letter);
        }

        Collections.sort(letters);
        System.out.println("Post-Sort: ");
        for (String letter : letters) {
            System.out.println(letter);
        }

        Collections.reverse(letters);
        System.out.println("Reverse Sort: ");
        for (String letter : letters) {
            System.out.println(letter);
        }
    }
}
