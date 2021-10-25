package com.company.ClassDay6;

class ThreadPriorityDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Thread name is: " + Thread.currentThread().getName());
        System.out.println("Running Thread priority is: " + Thread.currentThread().getPriority());
    }
}


public class Demo6 {
    public static void main(String[] args) {
        ThreadPriorityDemo demo = new ThreadPriorityDemo();

        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        Thread t3 = new Thread(demo);
        Thread t4 = new Thread(demo);
        Thread t5 = new Thread(demo);
        Thread t6 = new Thread(demo);
        Thread t7 = new Thread(demo);
        Thread t8 = new Thread(demo);
        Thread t9 = new Thread(demo);
        Thread t10 = new Thread(demo);

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);
        t6.setPriority(6);
        t7.setPriority(7);
        t8.setPriority(8);
        t9.setPriority(9);
        t10.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
