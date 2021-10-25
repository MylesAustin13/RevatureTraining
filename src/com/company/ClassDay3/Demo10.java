package com.company.ClassDay3;

class Student{
    public int roll_number;
    public String name;
    public static String school_name = "Hogwarts";

}

public class Demo10 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.roll_number = 1;
        student1.name = "Mikey";

        Student student2 = new Student();
        student2.roll_number = 2;
        student2.name = "John";
    }
}
