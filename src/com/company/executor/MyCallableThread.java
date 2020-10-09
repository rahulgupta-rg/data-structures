package com.company.executor;

import java.util.concurrent.Callable;

public class MyCallableThread implements Callable<Employee> {

    private Employee e;

    MyCallableThread(Employee e) {
        this.e = e;
    }

    @Override
    public Employee call() throws Exception {
        Thread.sleep(1000);
        System.out.println(e.toString());
        e.setId(2);
        e.setName("Motu");
        return e;
    }
}
