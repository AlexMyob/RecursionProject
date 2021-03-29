package com.company;

public class runtimeTest {

    //System time variables
    private long initialTime = 0;
    private long recursiveRuntime = 0;
    private long iterativeRuntime = 0;

    public void factorialRuntime() {
        int[] testArray = new int[20];

        //Filling test array with 20 random integers between 0 and 9999
        for (int i = 1; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 9999);
        }

        //Performing recursive runtime test
        System.out.println("Testing recursive factorial algorithm with 20 random values between 0 and 9999..." + "\n");

        for (int j : testArray) {
            this.initialTime = System.nanoTime(); //Setting initial time to current system time
            System.out.println("Factorial of " + j + " is " + recursiveAlgorithms.factorial(j));
            this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method
            System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns" + "\n");
        }

        //Performing iterative runtime test
        System.out.println("\n" + "Testing iterative factorial algorithm with 20 random values between 0 and 9999..." + "\n");
        for (int j : testArray) {
            this.initialTime = System.nanoTime(); //Setting the initial time to current system time
            System.out.println("Factorial of " + j + " is " + iterativeAlgorithms.nfactorial(j));
            this.iterativeRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the iterative method
            System.out.println("Iterative Method Runtime: " + this.iterativeRuntime + " ns" + "\n");
        }
    }

    public void fibonacciRuntime() {
        int[] testArray = new int[20];

        //Filling test array with 20 random integers between 0 and 50
        for (int i = 1; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 50);
        }

        //Performing recursive runtime test
        System.out.println("Testing recursive fibonacci algorithm with 20 random values between 0 and 50..." + "\n");
        for (int j : testArray) {
            this.initialTime = System.nanoTime(); //Setting the initial time to current system time
            System.out.println("Fibonacci number at index " + j + ": " + recursiveAlgorithms.fibonacci(j));
            this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method
            System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns" + "\n");
        }

        //Performing iterative runtime test
        System.out.println("\n" + "Testing iterative fibonacci algorithm with 20 random values between 0 and 50..." + "\n");
        for (int j : testArray) {
            this.initialTime = System.nanoTime(); //Setting the initial time to current system time
            System.out.println("Fibonacci number at index " + j + ": " + iterativeAlgorithms.nfibonacci(j));
            this.iterativeRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the iterative method
            System.out.println("Iterative Method Runtime: " + this.iterativeRuntime + " ns" + "\n");
        }
    }

    public void ispalindromeRuntime() {
        String[] testArray = new String[20];

        //Filling string array with 20 test strings
        testArray[0] = "anna";
        testArray[1] = "civic";
        testArray[2] = "kayak";
        testArray[3] = "did";
        testArray[4] = "level";
        testArray[5] = "bob";
        testArray[6] = "racecar";
        testArray[7] = "i did did i";
        testArray[8] = "wow";
        testArray[9] = "noon";
        testArray[10] = "random sentence";
        testArray[11] = "recursion is neat";
        testArray[12] = "john went to the store";
        testArray[13] = "delaware is the first state";
        testArray[14] = "kent";
        testArray[15] = "bobby";
        testArray[16] = "frank";
        testArray[17] = "ray";
        testArray[18] = "nissan";
        testArray[19] = "ford";

        //Performing recursive runtime test
        System.out.println("Checking 20 strings using ispalindrome recursive algorithm..." + "\n");
        for (String j : testArray) {
            this.initialTime = System.nanoTime(); //Setting the initial time to current system time
            if (recursiveAlgorithms.isPalindrome(j)) {
                System.out.println(j + ": is a palindrome");
            } else {
                System.out.println(j + ": is not a palindrome");
            }
            this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method
            System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns" + "\n");
        }

        //Performing iterative runtime test
        System.out.println("\n" + "Checking 20 strings using ispalindrome iterative algorithm..." + "\n");
        for (String j : testArray) {
            this.initialTime = System.nanoTime(); //Setting the initial time to current system time
            if (iterativeAlgorithms.nisPalindrome(j)) {
                System.out.println(j + ": is a palindrome");
            } else {
                System.out.println(j + ": is not a palindrome");
            }
            this.iterativeRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the iterative method
            System.out.println("Iterative Method Runtime: " + this.iterativeRuntime + " ns" + "\n");
        }
    }

    public void binarySearchRuntime() {
        int[] intArray = new int[1000];
        int[] testArray = new int[20];

        //Filling list array with 1000 multiples of 3
        for (int i = 1; i < intArray.length; i++) {
            intArray[i] = i * 3;
        }

        //Filling test array with 20 random integers between 0 and 3000
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 3000);
        }

        //Performing recursive runtime test
        System.out.println("\n" + "Performing binary search using recursive algorithm..." + "\n");
        for (int j : testArray) {
            this.initialTime = System.nanoTime(); //Setting the initial time to current system time
            if (recursiveAlgorithms.recursiveBinarySearch(intArray, j) == -1) {
                System.out.println(j + " was not located in the list");
            } else {
                System.out.println(j + " was located in the list at index: " + recursiveAlgorithms.recursiveBinarySearch(intArray, j));
            }
            this.recursiveRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the recursive method
            System.out.println("Recursive Method Runtime: " + this.recursiveRuntime + " ns" + "\n");
        }

        //Performing iterative runtime test
        System.out.println("\n" + "Performing binary search using iterative algorithm..." + "\n");
        for (int j : testArray) {
            this.initialTime = System.nanoTime(); //Setting the initial time to current system time
            if (iterativeAlgorithms.nBinarySearch(intArray, j) == -1) {
                System.out.println(j + " was not located in the list");
            } else {
                System.out.println(j + " was located in the list at index: " + iterativeAlgorithms.nBinarySearch(intArray, j));
            }
            this.iterativeRuntime = System.nanoTime() - this.initialTime; //Calculating the runtime of the
            System.out.println("Iterative Method Runtime: " + this.iterativeRuntime + " ns" + "\n");
        }
    }
}
