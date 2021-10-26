package com.company.ClassDay7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo19 {
    public static void main(String[] args) {
        //Create list of integer
        List<Integer> numbers = Arrays.asList(2,3,4,5,6);
        //demonstrate use of the map method
        //find square of each element
        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(square);

        //Create a list of String
        List<String> names = Arrays.asList("Markiplier","Bill","Dwight","Cybil");

        //demonstrate the use of filter
        //filter all names starting with M

        List<String> result = names.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());
        System.out.println(result);


        //Demonstrate Sort
        List<String> sorted = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        //integer list
        List<Integer> numbers2 = Arrays.asList(16,324,196);

        //demonstrate foreach
        numbers2.stream().map(x -> x*x).forEach(y -> System.out.println(y));


    }
}
