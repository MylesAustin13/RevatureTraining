package com.company.ClassDay5;

public class Demo13 {
    public static void main(String[] args) {
        //1st
        try{

        } catch (Exception e){

        }

        //2nd
        try{

        }catch(ArithmeticException e){

        } catch (Exception e){

        }

        //3rd
        try{
            try{

            } catch(Exception e) {

            }
        } catch (Exception e){

        }

        //4th
        try{

        } finally{

        }

        //5th?

        //Can't use catch on its own
        /*catch(Exception){

        }*/
    }
}
