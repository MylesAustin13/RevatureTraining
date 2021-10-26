package com.company.ClassDay7;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    public int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        if(id > other.id){
            return 1;
        }
        else if(id < other.id){
            return -1;
        }
        else{
            return 0;
        }

    }
}

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();

        emps.add(new Employee(2, "Mark Smith", 40));
        emps.add(new Employee(1, "Joseph Mama", 30));

        emps.add(new Employee(3, "Peter", 50));

        System.out.println("Pre-Sort: ");
        for (Employee emp : emps) {
            System.out.println(emp);
        }

        Collections.sort(emps);
        Collections.reverse(emps);
        System.out.println("Post-Sort: ");
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
}
