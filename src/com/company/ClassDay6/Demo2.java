package com.company.ClassDay6;

class MultiThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}


public class Demo2 {
    public static void main(String[] args) {
        MultiThreadDemo2 threadDemo = new MultiThreadDemo2();
        Thread t1 = new Thread(threadDemo);
        t1.start();
    }
}
