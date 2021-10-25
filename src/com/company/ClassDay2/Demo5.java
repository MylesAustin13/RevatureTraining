package com.company.ClassDay2;

public class Demo5 {
    public static void main(String[] args) {
        int score = 75;

        if(score >= 90)
            System.out.println("Grade: A");
        else if(score < 90 && score >= 75)
            System.out.println("Grade: B");
        else if(score < 75 && score >= 50)
             System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}
