package com.company;

import java.math.BigInteger;

public class recursiveAlgorithms {

    public static BigInteger factorial(int n) {
        if (n == 0) { //base case
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1)); //Recursive call
        }
    }
}
