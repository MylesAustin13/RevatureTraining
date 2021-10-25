package com.company.ClassDay4;

class Student{
    private int id;
    private String name;
    private int passMark = 40;

    public int getId(){
        return id;
    }

    public void setId(int id) throws Exception{
        if(id < 0){
            throw new Exception("ID cannot be negative");
        }
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) throws Exception{
        if(name.isBlank()){
            throw new Exception("Name cannot be blank");
        }
        this.name = name;
    }

    public int getPassMark(){
        return passMark;
    }
}

public class Demo1 {
    public static void main(String[] args) throws Exception{
        Student student = new Student();
        student.setId(1);
        student.setName("Joel");
        System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", PassMark: " + student.getPassMark());
    }
}
