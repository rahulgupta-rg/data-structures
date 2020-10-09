package com.company;

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("In main function");
        System.out.println(Thread.currentThread().getName() + " " +"About to call created thread");
        ThreadDemo threadDemo = new ThreadDemo("Even");
        Thread2 thread2 = new Thread2("Thread2");
        threadDemo.setThread2(thread2);
        threadDemo.join();
        System.out.println(Thread.currentThread().getName() + " " +"Main is back again");
    }

}

class ThreadDemo extends Thread{

    ThreadDemo(String string) {
        super(string);
        super.start();
    }

    private Thread2 thread2;

    void setThread2(Thread2 thread2) {
        System.out.println("Setting thread2 value");
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        for (int i = 10 ; i>0 ; i--) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred " + e.getMessage());
            }
            if (i == 5) {
                try {
                    thread2.start();
                    thread2.join();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " Exception occurred " + e.getMessage());
                }
            }
        }
    }
}

class Thread2 extends Thread {

    Thread2(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 100 ; i<110 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred " + e.getMessage());
            }
        }
    }

}