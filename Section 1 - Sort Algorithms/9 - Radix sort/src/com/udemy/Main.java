package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(radixArray, 10, 4);
        printArray(radixArray);
    }

    static void radixSort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++)
            radixSingleSort(arr, i, radix);
    }

    static void radixSingleSort(int[] arr, int position, int radix) {
        int numItems = arr.length;
        int[] countArray = new int[radix];

        for (int element : arr)
            countArray[getDigit(position, element, radix)]++;

        for (int j = 1; j < radix; j++) // Adjust the count array.
            countArray[j] += countArray[j - 1];

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--)
            temp[--countArray[getDigit(position, arr[tempIndex], radix)]] = arr[tempIndex];

        System.arraycopy(temp, 0, arr, 0, numItems);
    }

    static int getDigit(int position, int element, int radix) {
        return element / (int) Math.pow(10, position) % radix;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
