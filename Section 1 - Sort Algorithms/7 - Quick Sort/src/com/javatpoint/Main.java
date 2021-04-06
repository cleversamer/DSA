package com.javatpoint;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray, 0, intArray.length - 1);
        printArray(intArray);
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int loc = partition(arr, start, end);
        quickSort(arr, start, loc - 1);
        quickSort(arr, loc + 1, end);
    }

    static int partition(int[] arr, int start, int end) {
        int left, loc = left = start, right = end, flag = 0;

        while (flag != 1) {

            while ((arr[loc] <= arr[right]) && (loc != right))
                right--;

            if (loc == right)
                flag = 1;

            if (arr[loc] > arr[right]) {
                arr[loc] += arr[right];
                arr[right] = arr[loc] - arr[right];
                arr[loc] -= arr[right];
                loc = right;
            }

            if (flag != 1) {
                while ((arr[loc] >= arr[left]) && (loc != left))
                    left++;

                if (loc == left)
                    flag = 1;

                if (arr[loc] < arr[left]) {
                    arr[loc] += arr[left];
                    arr[left] = arr[loc] - arr[left];
                    arr[loc] -= arr[left];
                    loc = left;
                }
            }
        }
        return loc;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int element : arr)
            System.out.print(element + ", ");
        System.out.println("\b\b]");
    }
}
