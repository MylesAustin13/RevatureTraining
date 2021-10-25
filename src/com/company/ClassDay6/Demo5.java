package com.company.ClassDay6;

class ThreadNameDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("RUnning!");
    }
}

public class Demo5 {
    public static void main(String[] args) {
        ThreadNameDemo tnd = new ThreadNameDemo();

        Thread t1 = new Thread(tnd);
        Thread t2 = new Thread(tnd);

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.setName("NEWONE");
        t2.setName("NEWTWO");

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

    }
}
