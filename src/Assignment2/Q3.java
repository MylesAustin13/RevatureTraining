package Assignment2;

import java.util.Scanner;

class Average{

    public static void average(double a, double b, double c){
        System.out.println("Average: " + (a + b + c) / 3);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the first number.");
        double first = scanner.nextDouble();

        System.out.println("Provide the second number.");
        double second = scanner.nextDouble();

        System.out.println("Provide the third number.");
        double third = scanner.nextDouble();

        Average.average(first,second,third);

    }
}
