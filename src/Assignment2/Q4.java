package Assignment2;

abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{

    private double subject1;
    private double subject2;
    private double subject3;

    public A(double s1, double s2, double s3){ //Marks for each subject
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class B extends Marks{

    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double s1, double s2, double s3, double s4){ //Marks for each subject
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }
    @Override
     double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}

public class Q4 {
    public static void main(String[] args) {
        A studentA = new A(99,88,77);
        B studentB = new B(100,80,40,20);

        System.out.println("Student A's Average: " + studentA.getPercentage());
        System.out.println("Student B's Average: " + studentB.getPercentage());
    }
}
