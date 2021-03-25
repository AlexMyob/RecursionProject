package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class runtimeTest {

    //System time variables
    private long initialTime = 0;
    private long recursiveRuntime = 0;
    private long iterativeRuntime = 0;

    public void factorialRuntime() {
        //Accept user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        System.out.println("Calculating factorial of " + n + " using the recursive function...");

        this.initialTime = System.nanoTime(); //Setting initial time to current system time

        System.out.println("Factorial of " + n + " is " + recursiveAlgorithms.factorial(n)); //Running recursive method
        System.out.println();

        this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method

        System.out.println("Calculating factorial of " + n + " using the iterative function...");

        this.initialTime = System.nanoTime(); //Setting the initial time to current system time

        System.out.println("Factorial of " + n + " is " + iterativeAlgorithms.nfactorial(n)); //Running iterative method


        this.iterativeRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the iterative method
        System.out.println();

        //Displaying runtimes of each method
        System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns");
        System.out.println("Iterative Method Runtime: " + this.iterativeRuntime + " ns");
    }

    public void fibonacciRuntime() {
        //Accept user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();
        System.out.println("Calculating the Fibonacci number at index " + index + " using the recursive method...");

        this.initialTime = System.nanoTime(); //Setting the initial time to current system time

        System.out.println("Fibonacci number at index " + index + " is " + recursiveAlgorithms.fibonacci(index));
        System.out.println();

        this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method

        System.out.println("Calculating the Fibonacci number at index " + index + " using the iterative method...");

        this.initialTime = System.nanoTime(); //Setting the initial time to current system time

        System.out.println("Fibonacci number at index " + index + " is " + iterativeAlgorithms.nfibonacci(index));
        System.out.println();

        this.iterativeRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the iterative method

        //Displaying runtimes of each method
        System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns");
        System.out.println("Iterative Method Runtime: " + this.iterativeRuntime + " ns");
    }

    public void ispalindromeRuntime() {

        System.out.println("Checking if string is a palindrome using the recursive algorithm...");
        this.initialTime = System.nanoTime(); //Setting the initial time to current system time

        System.out.println("Is moon a palindrome? " + recursiveAlgorithms.isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + recursiveAlgorithms.isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + recursiveAlgorithms.isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + recursiveAlgorithms.isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + recursiveAlgorithms.isPalindrome("ab"));
        System.out.println();

        this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method

        System.out.println("Checking if string is a palindrome using the iterative algorithm...");
        this.initialTime = System.nanoTime(); //Setting the initial time to current system time

        System.out.println("Is moon a palindrome? " + iterativeAlgorithms.nisPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + iterativeAlgorithms.nisPalindrome("noon"));
        System.out.println("Is a a palindrome? " + iterativeAlgorithms.nisPalindrome("a"));
        System.out.println("Is aba a palindrome? " + iterativeAlgorithms.nisPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + iterativeAlgorithms.nisPalindrome("ab"));
        System.out.println();

        this.iterativeRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the iterative method

        //Displaying runtimes of each method
        System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns");
        System.out.println("Iterative Method Runtime: " + this.iterativeRuntime + " ns");
    }

    public void binarySearchRuntime() {
        int intarray[] = new int[1000];

        for (int i = 1; i < intarray.length; i++) {
            intarray[i] = i * 3;
        }

        System.out.println("Performing recursive binary search using recursive algorithm...");
        this.initialTime = System.nanoTime(); //Setting the initial time to current system time

        recursiveAlgorithms.recursiveBinarySearch(intarray, 2,3,4);

        this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method

        System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns");
    }
}
