package com.company.ClassDay5;

class EmployeeException extends Exception{ //MUST EXTEND EXCEPTION / THROWABLE

}

public class Demo3 {
    public static void main(String[] args) throws EmployeeException{

//        ArithmeticException ex = new ArithmeticException();
//        throw ex;

//        throw new ArithmeticException();
        throw new EmployeeException();
    }
}
