package com.company.Assignment1;

import java.util.Scanner;

public class EMICalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Loan Request: $");
        double loan = scanner.nextDouble();
        System.out.print("Input Monthly Interest Rate: %");
        double rate = scanner.nextDouble() * .01;
        System.out.println(rate);
        System.out.print("Input Tenure (in months): ");
        int months = scanner.nextInt();

        double result =  loan * rate * ( (Math.pow(1 + rate, months) ) / (Math.pow(1 + rate, months) - 1) );
        System.out.println("Result: " + result);

    }
}
