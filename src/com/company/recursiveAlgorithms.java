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

    public static BigInteger fibonacci(int index) {
        if (index == 1) {           // Base case 1
            return BigInteger.ZERO;
        }
        if (index <= 2) {    // Base case 2
            return BigInteger.ONE;
        } else {                    // Reduction and recursive calls
            return fibonacci(index - 1).add(fibonacci(index - 2));
        }
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

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    public static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high) { // The list has been exhausted without a match
            return -1;
        }
        if (key < list[mid]) {
            return recursiveBinarySearch(list, key, low, mid - 1);
        } else if (key == list[mid]) {
            return mid;
        } else {
            return recursiveBinarySearch(list, key, mid + 1, high);
        }
    }
}
