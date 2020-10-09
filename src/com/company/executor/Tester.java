package com.company.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Tester {

    public static void main(String[] args) {

        Employee e = new Employee(1,"Rahul");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Executor executor = Executors.newScheduledThreadPool(10);
        MyCallableThread callableThread = new MyCallableThread(e);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable thread called");
            }
        };
        executor.execute(runnable);
        Future<Employee> future =  executorService.submit(callableThread);
        try{
            System.out.println(future.get());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
