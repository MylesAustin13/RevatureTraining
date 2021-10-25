package com.company.ClassDay3;

class Employee{
    public int empId;
    public String firstname;
    public String lastname;
    public String email;

    public void getFullName(){
        System.out.println(firstname + " " + lastname);
    }
}

class FullTimeEmployee extends Employee{

    public int annualSalary;


}

class PartTimeEmployee extends Employee{

    public int hourSalary;

}

public class Demo5 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstname = "Spongebob";
        fte.lastname = "Squarepants";

        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstname = "Johnny";
        pte.lastname = "Test";

        fte.getFullName();
        pte.getFullName();
    }
}
