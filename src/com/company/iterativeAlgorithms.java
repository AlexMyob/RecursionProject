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
        long prevPrev = 0;
        long prev = 1;
        long currentValue = 0;

        if (index == 1) { // Base case
            return 0;
        } else if (index == 2) { // Base case
            return 1;
        }
        for (int i = 2; i < index; i++) {
            currentValue = prevPrev + prev;
            prevPrev = prev;
            prev = currentValue;
        }
        return currentValue;
    }

    public static boolean nisPalindrome(String s) {
        if (s == null) {
            return false; //The string is empty
        }
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}



