package Assignment2;

import java.util.Scanner;

class Rectangle{
    double length;
    double width;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    int getArea(){
        return (int) (length * width);
    }

}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide the Rectangle's length: ");
        double len = scanner.nextDouble();

        System.out.print("Provide the Rectangle's width: ");
        double wid = scanner.nextDouble();

        Rectangle rect = new Rectangle(len,wid);
        System.out.println("Area (as an integer): " + rect.getArea());

    }

}
