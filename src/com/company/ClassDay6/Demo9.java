package com.company.ClassDay6;

class Bank{
    int balance = 10000;

    synchronized void withdraw(int amount){
        if(balance < amount){
            System.out.println("Balance insufficient.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Amount Remaining: $" + balance);

    }

    synchronized void deposit(int amount){
        System.out.println("Deposit processing...");
        balance += amount;
        System.out.println("Deposit Complete!");
        System.out.println("Amount Remaining: $" + balance);
        notify();
    }
}

class DepositThread extends Thread{
    Bank bank;
    public DepositThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.deposit(10000);
    }
}

class WithdrawThread extends Thread{
    Bank bank;
    public WithdrawThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.withdraw(15000);
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Bank b = new Bank();
        DepositThread dt = new DepositThread(b);
        WithdrawThread wt = new WithdrawThread(b);

        wt.start();
        dt.start();

    }
}
