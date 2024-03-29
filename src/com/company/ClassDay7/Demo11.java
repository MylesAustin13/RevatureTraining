package com.company.ClassDay7;

interface ISayHello{
    String hello();
}

interface ISayHello2{
    String hello(String name);
}

interface ICalculator{
    int addNumber(int a, int b);
}
public class Demo11 {
    public static void main(String[] args) {
        ISayHello s = () -> {
            return "Hello World";
        };

        String result = s.hello();
        System.out.println(result);

        ISayHello2 s2 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s2.hello("Paul"));

        ICalculator calc = (x, y) -> {
            return x + y;
        };
        System.out.println("Sum: " + calc.addNumber(100, 200));


    }
}
