package com.company.ClassDay5;


import java.util.ArrayList;

public class Demo19 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark Rover");
        names.add("Larry the Cucumber");
        names.add("Alfred");
        names.add("William");

        System.out.println(names);

        System.out.println(names.get(1));

        names.add(1,"Rangel");
        System.out.println(names);

        //merge 2 lists
        ArrayList<String> more_names = new ArrayList<>();
        more_names.add("Smith");
        more_names.add("Groose");

        //names.addAll(more_names); //Add to end
        names.addAll(0, more_names); //Add to specific spot
        System.out.println(names);

        //remove by value
        names.remove("William");
        System.out.println(names);

        //remove by index
        names.remove(2);
        System.out.println(names);

        //remove based on condition
        names.removeIf(name -> name.equals("Smith"));
        System.out.println(names);
    }
}
