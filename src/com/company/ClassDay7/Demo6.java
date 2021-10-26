package com.company.ClassDay7;

class MyClass<T>{
    T obj;

    void add(T ob){
        obj = ob;
    }

    T getEm(){
        return obj;
    }

}

public class Demo6 {
    public static void main(String[] args) {
        MyClass<String> myClass = new MyClass<>();
        myClass.obj = "Yo!";
        myClass.add("World");
        String a = myClass.getEm();
        System.out.println(a);
    }
}
