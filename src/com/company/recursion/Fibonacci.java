package com.company.recursion;

public class Fibonacci {

    static int fib(int n)
    {
        if(n <1) return 0;
        if(n == 1 || n==2) {
            return n;
        }
        /*if (n == 2) {
            return 1;
        }*/
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
} // 0 1 1 2 3
