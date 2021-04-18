package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[10];
        int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};

        for (int element : numsToAdd)
            nums[hash(element)] = element;

        printArray(nums);
    }

    static int hash(int value) {
        return Math.abs(value % 10);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
