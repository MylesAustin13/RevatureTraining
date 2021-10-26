package com.company.ClassDay7;

import java.io.*;

class Customer implements Serializable {
    int id;
    String name;
    String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class Demo17 {
    public static void main(String[] args) {
        //Create the object
        Customer cust1 = new Customer(102,"Billy","b@fakemail.com");
        Customer cust2 = new Customer(222,"Dwight","dw@fakemail.com");

        //Create the stream and write the object
        try {
            FileOutputStream fout = new FileOutputStream("cust.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(cust1);
            out.writeObject(cust2);
            out.flush();

            //close stream
            out.close();
            fout.close();
            System.out.println("Success!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
