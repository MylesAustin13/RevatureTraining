package com.company.ClassDay6;
/** NO SYNC
class Table{
    public void printTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number + " x " + i + " = " + number * i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
*/
//with sync
class Table{
    public synchronized void printTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number + " x " + i + " = " + number * i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    public MyThread1(Table table){
        t = table;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    public MyThread2(Table table){
        t = table;
    }

    @Override
    public void run() {
        t.printTable(500);
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Table table = new Table();
        MyThread1 t1 = new MyThread1(table);
        MyThread2 t2 = new MyThread2(table);

        t1.start();
        t2.start();



    }
}
