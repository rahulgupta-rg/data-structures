package com.company;



public class Main {

    private int sumDisplay( int n) {
        if ( n/10 == 0) {
            System.out.println(n);
            return n;
        }
        int sum;
        int rem = n%10;
        int div = n/10;
        System.out.println(rem);
        sum = rem + sumDisplay(div);
        return sum;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(new Main().sumDisplay(4235));

    }
}
