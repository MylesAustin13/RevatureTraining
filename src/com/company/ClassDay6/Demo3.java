package com.company.ClassDay6;

class ThreadSleep implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        ThreadSleep naptime = new ThreadSleep();
        Thread t1 = new Thread(naptime);
        Thread t2 = new Thread(naptime);
        t1.start();
        t2.start();
    }
}
