package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println("Iterative binary search:" +
                "\n" + iterativeBinarySearch(intArray, -15) +
                        "\n" + iterativeBinarySearch(intArray, 35) +
                        "\n" + iterativeBinarySearch(intArray, 8888) +
                        "\n" + iterativeBinarySearch(intArray, 1) +
                        "\nRecursive binary search:" +
                        "\n" + recursiveBinarySearch(intArray, -15) +
                        "\n" + recursiveBinarySearch(intArray, 35) +
                        "\n" + recursiveBinarySearch(intArray, 8888) +
                        "\n" + recursiveBinarySearch(intArray, 1));
    }

    public static int iterativeBinarySearch(int[] arr, int value) {
        int start = 0, end = arr.length;
        while (start < end) {
            int midpoint = (start + end) / 2;
            if (arr[midpoint] == value)
                return midpoint;
            else if (arr[midpoint] < value)
                start = midpoint + 1;
            else
                end = midpoint;
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int value) {
        return recursiveBinarySearch(arr, 0, arr.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end)
            return -1;

        int midpoint = (start + end) / 2;

        if (input[midpoint] == value)
            return midpoint;
        else if (input[midpoint] < value)
            return recursiveBinarySearch(input, midpoint + 1, end, value);

        return recursiveBinarySearch(input, start, midpoint, value);
    }
}
