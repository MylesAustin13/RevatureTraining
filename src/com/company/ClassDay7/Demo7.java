package com.company.ClassDay7;

class Test{
    public <E> void printArray(E[] elements){
        for (E element : elements) {
            System.out.println(element);
        }
    }
    //Can use T as well! This breaks conventions!
    public <T> void printThingie(T[] elements){
        for(T element : elements){
            System.out.println(element);
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        Test test = new Test();
        Integer[] intArray = {10,2,3213,23145};
        Character[] charArray = {'A', '?','o','d'};

        test.printThingie(intArray);
        System.out.println("------------------");
        test.printArray(charArray);
    }
}
