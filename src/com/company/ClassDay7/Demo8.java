package com.company.ClassDay7;

class Employee2{
    String name;

    public <T> Employee2(T name){
        this.name = name.toString();
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Timmy");
        Employee2 emp2 = new Employee2(123123);
    }
}
