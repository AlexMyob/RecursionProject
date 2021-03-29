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

    public static BigInteger nfibonacci(long index) {
        long prevPrev = 0;
        long prev = 1;
        long currentValue = 0;

        if (index == 1) { // Base case
            return BigInteger.ZERO;
        } else if (index == 2) { // Base case
            return BigInteger.ONE;
        }
        for (int i = 2; i < index; i++) {
            currentValue = prevPrev + prev;
            prevPrev = prev;
            prev = currentValue;
        }
        return BigInteger.valueOf(currentValue);
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

    public static int nBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            }
            if (key > list[mid]) {
                low = mid + 1;
            }
            if (key == list[mid]) {
                return mid;
            }
        }
        return -1;
    }
}




