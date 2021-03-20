package com.company;

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

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static int nfactorial(int n) {
        int temp = 1;

        if (n == 0) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                temp = temp * i;
            }
            return temp;
        }
    }
}
