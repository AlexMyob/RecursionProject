package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class computeFactorial {

    //System time variables
    static long initialTime = 0;
    static long postTime = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        System.out.println("Calculating factorial of " + n + " using the recursive function...");

        initialTime = System.nanoTime();

        System.out.println("Factorial of " + n + " is " + factorial(n));

        postTime = System.nanoTime() - initialTime;
        System.out.println("Runtime: " + postTime + " ns");

        initialTime = System.nanoTime();

        System.out.println("Calculating factorial of " + n + " using the iterative function...");
        System.out.println("Factorial of " + n + " is " + nfactorial(n));

        postTime = System.nanoTime() - initialTime;
        System.out.println("Runtime: " + postTime + " ns");

    }

    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1)); // Recursive call
        }
    }

    public static BigInteger nfactorial(int n) {
        BigInteger temp = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            temp = temp.multiply(BigInteger.valueOf(i));
        }
        return temp;
    }
}


