package com.company;

import java.math.BigInteger;

public class iterativeAlgorithms {

    public static BigInteger nfactorial(int n) {
        BigInteger factorial = new BigInteger("1");
        //Multiplying the factorial BigInteger by the current value of i for each iteration starting from 1
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static long nfibonacci(long index) {
        long fib = 0;
        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else {
            fib = (index-1) + (index-2);
        }
        return fib;
    }

    public static boolean nisPalindrome(String s, int low, int high) {
        for (int i = 0; i < s.length(); i++) {
            if (high <= low) // Base case
                return true;
            else if (s.charAt(low) != s.charAt(high)) // Base case
                return false;
        }
            return false;
    }

}

