package com.company.ClassDay7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(rollNumber > o.rollNumber){
            return 1;
        }
        else if(rollNumber < o.rollNumber){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class SortByAge implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.age > s2.age){
            return 1;
        }
        else if(s1.age < s2.age){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
       return s1.name.compareTo(s2.name);
        /*if(s1.age > s2.age){
            return 1;
        }
        else if(s1.age < s2.age){
            return -1;
        }
        else{
            return 0;
        }*/
    }
}

public class Demo4 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Joel", 22));
        students.add(new Student(1, "Vinny", 25));
        students.add(new Student(3, "Tom", 18));

        System.out.println("Pre-Sort: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("Post-Sort (By Roll No.): ");
        for (Student student : students) {
            System.out.println(student);
        }
        Collections.sort(students, new SortByAge());
        System.out.println("Post-Sort (By Age): ");
        for (Student student : students) {
            System.out.println(student);
        }
        Collections.sort(students, new SortByName());

        System.out.println("Post-Sort (By Name): ");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
