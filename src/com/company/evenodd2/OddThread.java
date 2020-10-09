package com.company.evenodd2;

public class OddThread implements Runnable {

    private SharedPrinter printer;

    private int limit;

    OddThread(SharedPrinter printer, int limit) {
        this.printer = printer;
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Odd thread started ");
        int start = 1;
        while (start <= limit) {
            printer.printOdd(start);
            start = start+2;
        }
    }
}
