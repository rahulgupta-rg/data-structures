package com.company.threads2;

public class ThreadDemoDriver {

    public static void main(String[] args) {
        ThreadDemo demo = new ThreadDemo("Even");
        ThreadDemo demo1 = new ThreadDemo("Odd");
        demo.start();
        demo1.start();
    }
}
