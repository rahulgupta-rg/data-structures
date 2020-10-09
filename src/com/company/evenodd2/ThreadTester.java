package com.company.evenodd2;

public class ThreadTester {

    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();
        OddThread oddThread = new OddThread(sharedPrinter, 1000);
        EvenThread evenThread = new EvenThread(sharedPrinter, 1000);
        Thread t1 = new Thread(oddThread, "oddThread");
        Thread t2 = new Thread(evenThread, "evenThread");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main is over");
    }
}
