package com.company.ClassDay3;

interface IEmployee{
    void print();
}

class Employee1 implements IEmployee{
    @Override
    public void print(){
        System.out.println("interface print method");
    }
}

class Z{

}

public class Demo26 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.print();

        IEmployee eee = new Employee1();
    }
}
