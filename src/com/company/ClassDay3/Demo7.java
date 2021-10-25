package com.company.ClassDay3;

//Simple
/*class A{

}
class B extends A{

}
 */

//Multi-Level

  class A{

    public A(){
        System.out.println("Constructor A");
    }
    public void tester1(){
        System.out.println("Class A mehtod");
    }
  }

  class B extends A{

    public B(){
        System.out.println("Constructor B");
    }
    public void tester2(){
        System.out.println("Class B method");
    }
  }
  class C extends B{

    public C(){
        System.out.println("Constructor C");
    }
    public void tester3(){
        System.out.println("Class C method");
    }
  }



public class Demo7 {
    public static void main(String[] args) {
        A a = new A();
        a.tester1();
        B b = new B();
        b.tester1();
        b.tester2();
        C c = new C();
        c.tester1();
        c.tester2();
        c.tester3();
    }
}
