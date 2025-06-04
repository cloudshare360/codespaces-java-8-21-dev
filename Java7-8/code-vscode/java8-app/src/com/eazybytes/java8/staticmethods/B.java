package com.eazybytes.java8.staticmethods;


public class B implements A {
    public static void sayHello() {
        System.out.println("Hi, this is a static method inside class B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.sayHello();
        B.sayHello();
        A.sayHello();

    }
}