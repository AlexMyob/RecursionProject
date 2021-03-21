package com.company;

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

        initialTime = System.nanoTime(); //Setting initial time to current system time

        System.out.println("Factorial of " + n + " is " + recursiveAlgorithms.factorial(n)); //Running recursive method

        recursiveRuntime = System.nanoTime() - initialTime; //Calculating the runtime of the recursive method

        System.out.println("Calculating factorial of " + n + " using the iterative function...");

        initialTime = System.nanoTime(); //Setting the initial time to current system time

        System.out.println("Factorial of " + n + " is " + iterativeAlgorithms.nfactorial(n)); //Running iterative method

        iterativeRuntime = System.nanoTime() - initialTime; //Calculating the runtime of the iterative method

        //Displaying runtimes of each method
        System.out.println("Recursive Method Runtime: " + recursiveRuntime + " ns");
        System.out.println("Iterative Method Runtime: " + iterativeRuntime + " ns");
    }
}
