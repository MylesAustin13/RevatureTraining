package com.company.ClassDay7;


import com.company.ClassDay7.Customer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo18 {
    public static void main(String[] args) {
        //Create stream to read the object
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("cust.txt"));
            Customer customer = (Customer) in.readObject();
            Customer customer2 = (Customer) in.readObject();
            //Print data of serialized object
            System.out.println("Customer: " + customer.id +", Name: " + customer.name + ", Email: " + customer.email);
            System.out.println("Customer: " + customer2.id +", Name: " + customer2.name + ", Email: " + customer2.email);
            //CLose the stream
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
