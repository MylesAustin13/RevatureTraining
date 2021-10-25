package com.company.ClassDay5;



public class Demo6 {
    public static void main(String[] args) {
        //case 1: no exception occurs
        try{
            int c = 10 / 5;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Case 1: finally has been called");
        }


        //case 3: exception occurred and handled
        try{
            int c = 20 / 0;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Case 3: finally has been called");
        }


        //case 2: exception occurred, NOT handled
        try{
            int c = 20/0;
        }
        finally {
            System.out.println("Case 2: finally has been called");
        }
    }
}
