package Assignment2;

abstract class Bank{
    abstract double getBalance();
}

class BankA extends Bank{
    //private double balance = 100;
    @Override
    double getBalance() {
        return 100;
    }
}

class BankB extends Bank{
    //private double balance = 150;
    @Override
    double getBalance() {
        return 150;
    }
}

class BankC extends Bank{
    //private double balance = 200;
    @Override
    double getBalance() {
        return 200;
    }
}

public class Q5 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("BankA balance: " + bankA.getBalance());
        System.out.println("BankB balance: " + bankB.getBalance());
        System.out.println("BankC balance: " + bankC.getBalance());
    }
}
