package com.challenge;

public class Solution {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);
        printArray(intArray);
    }

    static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = length - 1; i > 0; i--) {
            int smallest = 0;
            for (int j = 1; j <= i; j++)
                if (arr[j] < arr[smallest])
                    smallest = j;
            swap(arr, i, smallest);
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        if (index1 == index2)
            return;
        arr[index1] += arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] -= arr[index2];
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
