package com.company.threads;

public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1 ; i <= 1000 ; i++)  {
            if (i %2 == 0) {
                System.out.println("Number : " + i + " Thread name : "+
                        Thread.currentThread().getName());
            } else {
                System.out.println("Number : " + i + " Thread name : " +
                        Thread.currentThread().getName());
            }
        }
    }
}
