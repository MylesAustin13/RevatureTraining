package com.company.ClassDay6;

class Company{
    int item;
    boolean flag = false;
    //Flag = false means it is producer's turn
    //Flag = true means it is consumer's turn

    synchronized void producer(int item) throws InterruptedException {
        while(flag){
            wait();
        }
        this.item = item;
        System.out.println("Producer: " + this.item);
        flag = true;
        notifyAll();
    }

    synchronized int consumer() throws InterruptedException {
        while(!flag){
            wait();
        }
        System.out.println("Consumer: " + item);
        flag = false;
        notifyAll();
        return item;
    }
}

class Producer extends Thread{
    Company company;
    public Producer(Company c){
        company = c;
    }

    @Override
    public void run() {
        try {
            company.producer(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread{
    Company company;
    public Consumer(Company c){
        company = c;
    }

    @Override
    public void run() {
        try {
            company.consumer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo13 {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p1 = new Producer(comp);
        Consumer c1 = new Consumer(comp);
        Producer p2 = new Producer(comp);
        Consumer c2 = new Consumer(comp);
        Producer p3 = new Producer(comp);
        Consumer c3 = new Consumer(comp);
        Producer p4 = new Producer(comp);
        Consumer c4 = new Consumer(comp);
        Producer p5 = new Producer(comp);
        Consumer c5 = new Consumer(comp);


        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();




    }
}
