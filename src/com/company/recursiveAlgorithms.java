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

    public static long fibonacci(long index) {
        if (index == 1) // Base case 1
            return 0;
        else if (index == 2) // Base case 2
            return 1;
        else // Reduction and recursive calls
            return fibonacci(index - 1) + fibonacci(index - 2);
    }

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) // Base case
            return true;
        else if (s.charAt(low) != s.charAt(high)) // Base case
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }

}
