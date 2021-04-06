package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        System.out.println("Fibonacci algorithm:" +
                "\nBy recursion: F9 = " + recursiveFibonacci(6) +
                "\nBy iteration: F9 = " + iterativeFibonacci(6));
    }

    static int recursiveFibonacci(int n) {
        if (n <= 1)
            return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    static int iterativeFibonacci(int n) {
        int[] fibs = new int[n + 2];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i <= n; i++)
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        return fibs[n];
    }
}
