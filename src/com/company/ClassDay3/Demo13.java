package com.company.ClassDay3;

class Employee2{
    public int empId;
    public String name;
    public static String company_name = "Revature";

    public Employee2(int empId, String name){
        this.empId = empId;
        this.name = name;

    }

    public void printInfo(){
        System.out.println("Id: " + empId + ", Name: "+ name + ", Company Name: "+company_name);

    }
}

public class Demo13 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1, "Mark");
        Employee2 emp2 = new Employee2(2, "Ron");
        emp1.printInfo();
        emp2.printInfo();
        Employee2.company_name = "ABC";
        emp1.printInfo();
        emp2.printInfo();
    }
}
