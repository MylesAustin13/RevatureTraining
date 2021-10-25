package com.company.Assignment1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.println("Select an option: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        int choice = calc.nextInt();

        while((choice < 1 || choice > 4)){
            System.out.println("Invalid input. Try again.");
            choice = calc.nextInt();
        }

        String symbol = "";
        switch (choice){
            case 1:
                symbol = "+";
                System.out.println("Add which numbers?");
                break;
            case 2:
                symbol = "-";
                System.out.println("Subtract which numbers?");
                break;
            case 3:
                symbol = "*";
                System.out.println("Multiply which numbers?");
                break;
            case 4:
                symbol = "/";
                System.out.println("Divide which numbers?");
                break;
        }
        double num1 = calc.nextDouble();
        System.out.println(symbol);
        double num2 = calc.nextDouble();
        double result = 0;

        switch (choice){
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
        }

        System.out.println("Result: " + result);
    }
}
