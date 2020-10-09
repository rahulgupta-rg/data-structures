package com.company.threads;

public class ThreadDriver {

    public static void main(String[] args) {
        MyThread oddThread = new MyThread("oddThread");
        MyThread evenThread = new MyThread("evenThread");
        oddThread.start();
        evenThread.start();
    }
}
