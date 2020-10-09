package com.company.evenodd;

public class MyThread implements Runnable {

    private MyThreadTester tester;



    MyThread(MyThreadTester myThreadTester) {
        this.tester = myThreadTester;
    }

    @Override
    public void run() {
        int var ;
        synchronized (tester) {
            while (tester.getNum() <=1000) {
                if (tester.getNum()%2==0) {
                    System.out.println("Thread : " +Thread.currentThread().getName() + " Data : " + tester.getNum());
                    var = tester.getNum();
                    tester.setNum(var++);
                } else {
                    System.out.println("Thread : " +Thread.currentThread().getName() + " Data : " + (tester.getNum()));
                    var = tester.getNum();
                    tester.setNum(var++);
                }
            }
        }
    }
}
