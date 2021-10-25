package com.company.ClassDay5;

class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        System.out.println("Insufficient funds to withdraw the requested amount.");
    }

    public InsufficientFundException(String s){
        System.out.println(s);
    }
}


class BankAccount{
    private int balance = 0;
    private int account_number;

    public BankAccount(int account_number){
        this.account_number = account_number;
    }
    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount credited: $" + amount + ". Current Balance: $" + balance + ".");
    }

    public void withdraw(int amount) throws InsufficientFundException {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawn: $" + amount + ". Current Balance: $" + balance + ".");
        }
        else{
            throw new InsufficientFundException("Sorry, Link. I can't give credit! Come back when you're a little ... MMMMMM .... richer!");
        }
    }

    public int getBalance(){
        return balance;
    }
    public int getAccount_number(){
        return account_number;
    }

}

public class Demo4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123123);
        System.out.println(account.getBalance());
        account.deposit(5000);
        try{
            account.withdraw(2000);
        }
        catch(InsufficientFundException e){
            e.printStackTrace();
        }
        System.out.println(account.getBalance());
        try{
            account.withdraw(20000);
        }
        catch(InsufficientFundException e){
            e.printStackTrace();
        }
    }
}
