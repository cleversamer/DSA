package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(intArray, 2, 10);
        printArray(intArray);
    }

    static void countingSort(int[] arr, int min, int max) {
        int[] countArray = new int[(max - min) + 1];
        int j = 0;

        for (int element : arr)
            countArray[element - min]++;

        for (int i = min; i <= max; i++)
            while (countArray[i - min]-- > 0)
                arr[j++] = i;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
