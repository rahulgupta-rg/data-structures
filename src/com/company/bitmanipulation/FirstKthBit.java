package com.company.bitmanipulation;

public class FirstKthBit {

    int indexOfFirstRightSetBit(int n) {

        return (int)Math.ceil(Math.log((n^(n-1))+1));
    }

    int posOfRightMostDiffBit(int m, int n) {
        int val=(m^n);
        int count=1;
        while(val!=0)
        {
            if((val&1)!=0)
            {
                break;
            }
            count++;
            val=val>>1;
        }
        return count;
    }

    //Count total set bits in numbers from 1 to N (both inclusive)
    public static int countSetBits(int n){

        // Your code here
        n = n+1;
        int counter = 0;
        for(int i = 2 ; i/2 < n ; i= i*2) {
            int quotient = n/i;
            counter = counter + quotient*i/2;
            int remainder = n%i;
            if(remainder > i/2) {
                counter = counter + remainder - i/2;
            }
        }
        return counter;

    }

    // Function to count number of bits to
    // be flipped to convert A to B
    public static int countBitsFlip(int a, int b){

        // Your code here
        int xorNum = a^b;
        int counter = 0;
        while(xorNum!=0) {
            xorNum = xorNum&xorNum-1;
            counter++;
        }
        return counter;

    }

    /*  Function to calculate the largest consecutive ones
     *   x: given input to calculate the largest consecutive ones
     */
    public static int maxConsecutiveOnes(int x) {

        // Your code here
        int count = 0;
        while(x!=0) {
            x = x&(x>>1);
            count++;
        }
        return count;

    }

    // Function to swap odd and even bits
    public static int swapBits(int n) {
        // Your code
        int ev=n & 0xAAAAAAAA; //10101010101010101010101010101010 in binary. We get even bits set if they were in n
        int od=n & 0x55555555; //01010101010101010101010101010101 in binary. We get odd bits set if they were in n
        ev>>=1;// Right Shift the evn obtained previously by 1 positions and store it in evn
        od<<=1;// Left Shift the od obtained previously by 1 positions and store it in odd
        return (ev | od); //Do bitwise OR of evn and od to get the final result

    }

    static int multiplyWith3Point5(int x)
    {
        return (x<<1) + x + (x>>1);
    }

    public static void main(String[] args) {
        //System.out.println(new FirstKthBit().indexOfFirstRightSetBit(4));
        System.out.println(new FirstKthBit().posOfRightMostDiffBit(52,4));
        //System.out.println(FirstKthBit.countSetBits(4));
        //System.out.println(multiplyWith3Point5(2));
    }
}
