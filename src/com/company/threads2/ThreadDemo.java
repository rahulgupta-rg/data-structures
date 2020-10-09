package com.company.threads2;

public class ThreadDemo extends Thread {

    ThreadDemo(String name) {
        super(name);
    }

    @Override
    public synchronized void run() {
        for (int i = 0 ; i < 1000 ; i +=2) {
            System.out.println(Thread.currentThread().getName() + " " + i );
        }

        for (int i = 1 ; i <= 1000 ; i +=2) {
            System.out.println(Thread.currentThread().getName() + " " + i );
        }
    }
}
