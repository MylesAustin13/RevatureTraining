package com.company.ClassDay4;

public class Demo16 {
    public static void main(String[] args) {
        System.out.println("PerformanceTest");
        long startTime = System.currentTimeMillis();
        StringBuffer buff = new StringBuffer("Hello");
        for(int i = 0; i < 10000000;i++){
            buff.append("World");
        }
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("***************************");
        startTime = System.currentTimeMillis();
        StringBuilder build = new StringBuilder("Hello");
        for(int i = 0; i < 10000000;i++){
            build.append("World");
        }
        System.out.println("Time: "+ (System.currentTimeMillis() - startTime) + "ms");
    }
}
