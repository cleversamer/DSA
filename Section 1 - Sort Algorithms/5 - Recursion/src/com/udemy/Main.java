package com.udemy;

public class Main {

    public static void main(String[] args) {

        System.out.println("Factorial algorithm:" +
                "\nBy recursion: 10! = " + recursiveFactorial(10) +
                "\nBy iteration: 10! = " + iterativeFactorial(10));
    }

    static int recursiveFactorial(int num) {
        if (num == 0)
            return 1;
        return num * recursiveFactorial(num - 1);
    }

    static int iterativeFactorial(int num) {
        if (num == 0)
            return 1;
        int factorial = 1;
        for (int i = 1; i <= num; i++)
            factorial *= i;
        return factorial;
    }
}
