package com.company;

public class Jwels {

    private int digitCount = 0;

    private int findNumbers(int[] nums) {
        int count = 0;
        for ( int i = 0 ; i <nums.length ; i++ ) {
            if ( check(nums[i]) % 2 == 0) {
                count++;
            }
            digitCount = 0;
        }
        return count;
    }

    private int check( int num ) {
        if ( num < 10 ) {
            return ++digitCount;
        }
        digitCount++;
        return check(num/10);

    }

    public static void main(String[] args) {

        System.out.println( new Jwels().findNumbers(new int[] {120,345,2,6,78961}));
    }
}
