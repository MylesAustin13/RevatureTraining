package com.company.ClassDay5;

import java.util.ArrayList;

class Student{
    public int id;
    public String name;
    public String email;

    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Student= {" + "id=" + id + ", name=" + name + ", email=" + email + "}";
     }
}

public class Demo18 {
    public static void main(String[] args) {
        //user defined class object
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(1,"Bob", "bobby@gmail.com");
        Student student2 = new Student(2, "Dave", "crazydave@aol.com");
        Student student3 = new Student(3, "Tony", "twotontony@patmain.com");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        //iterator

        //for-each
        for(Student student : students){
            System.out.println(student);
        }
    }
}
