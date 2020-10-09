package com.company.PrintOddEvenMain;

public class OddEvenRunnable implements Runnable {

    public int PRINT_NUMBERS_UPTO = 1000;
    static int number = 1;
    int remainder;
    static Object lock = new Object();


    public OddEvenRunnable(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO) {
            synchronized (lock) {
                while (number % 2 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }

    }

}
