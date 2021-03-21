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
}
