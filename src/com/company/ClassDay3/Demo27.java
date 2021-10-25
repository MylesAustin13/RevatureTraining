package com.company.ClassDay3;

interface IBankAccount{
    boolean deposit(int amount);
    boolean withdraw(int amount);
    void getBalance();

}

class SavingAccount implements IBankAccount{

    private int balance;
    private int per_day_limit;

    @Override
    public boolean deposit(int amount) {
        balance += amount;
        System.out.println("Successfully deposited: $"+amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if(balance >= amount && !(per_day_limit + amount > 5000)){
            balance -= amount;
            per_day_limit += amount;
            System.out.println("Successfully withdrawn: $"+amount);
            return true;
        }
        else if(balance < amount){

            System.out.println("Insufficient funds.");
            return false;
        }
        else { //Perdaylimit is 5000
            System.out.println("Withdraw attempt failed. Try again tomorrow.");
            return false;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Savings account balance: " + balance);
    }
}

class CurrentAccount implements IBankAccount{
    private int balance;

    @Override
    public boolean deposit(int amount) {
        balance += amount;
        System.out.println("Successfully deposited: $"+amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Successfully withdrawn: $"+amount);
            return true;
        }
        else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Savings account balance: " + balance);
    }
}

public class Demo27 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.deposit(2000);
        savingAccount.withdraw(1000);
        savingAccount.getBalance();

        currentAccount.deposit(5000);
        currentAccount.withdraw(6000);
        currentAccount.withdraw(2000);
        currentAccount.getBalance();
    }
}
