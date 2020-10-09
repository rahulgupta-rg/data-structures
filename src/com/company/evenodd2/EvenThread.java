package com.company.evenodd2;

public class EvenThread implements Runnable {

    private SharedPrinter printer;

    private int limit;

    EvenThread(SharedPrinter printer, int limit) {
        this.printer = printer;
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Even thread started ");
        int start = 2;
        while (start <= limit) {
            printer.printEven(start);
            start = start+2;
        }
    }
}
