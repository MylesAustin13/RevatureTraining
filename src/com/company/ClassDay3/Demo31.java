package com.company.ClassDay3;

interface X{
    void print();
    interface Y{
        void display();
    }
}

class Z2 implements X{

    @Override
    public void print() {

    }
}

class Z3 implements X, X.Y{

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }
}

public class Demo31 {
    public static void main(String[] args) {

    }
}
