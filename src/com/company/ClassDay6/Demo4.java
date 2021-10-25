package com.company.ClassDay6;

class TestCallRun implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(i);
        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        TestCallRun test = new TestCallRun();

        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);

       // t1.start();
       // t2.start();

        t1.run();
        t2.run();
    }
}

