package com.company.evenodd2;

public class SharedPrinter {

    private boolean isOddPrinted = false;

    synchronized void printOdd(int num) {
        while (isOddPrinted) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread : " + Thread.currentThread().getName() + " Data : " + num);
        isOddPrinted = true;
        notify();
    }

    synchronized void printEven(int num) {
        while (!isOddPrinted) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread : " + Thread.currentThread().getName() + " Data : " + num);
        isOddPrinted = false;
        notify();
    }
}
