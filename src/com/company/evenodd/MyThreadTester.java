package com.company.evenodd;

public class MyThreadTester {

    private int num = 0;

    private boolean flag;

    public int getNum() { return num; }

    public void setNum( int num) { this.num = num; }

    private synchronized void printEven() {

    }

    private synchronized void printOdd() {

    }


    public static void main(String[] args) {

        MyThreadTester tester = new MyThreadTester();
        Thread t1 = new Thread(new MyThread(tester), "even");
        Thread t2 = new Thread(new MyThread(tester), "odd");
        t1.start();
        t2.start();
    }
}
