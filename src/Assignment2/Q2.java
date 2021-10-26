package Assignment2;


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your name: ");
        String name = scanner.nextLine();

        System.out.println("Provide your roll number: ");
        int roll_num = scanner.nextInt();
        scanner.nextLine(); //Jury rig a flush

        System.out.println("Provide your field of interest: ");
        String field = scanner.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + roll_num + ". My field of interest is " + field + ".");
    }
}
