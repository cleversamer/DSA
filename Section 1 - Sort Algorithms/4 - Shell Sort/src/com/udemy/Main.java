package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        shellSort(intArray);
        printArray(intArray);
    }

    static void shellSort(int[] arr) {
        int length = arr.length;
        for (int gap = length / 2; gap > 0; gap /= 2)
            for (int i = gap; i < length; i++) {
                int newElement = arr[i], j;
                for (j = i; j >= gap && arr[j - gap] > newElement; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = newElement;
            }
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
