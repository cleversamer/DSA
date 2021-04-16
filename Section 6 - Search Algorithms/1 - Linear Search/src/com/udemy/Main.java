package com.udemy;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println(linearSearch(intArray, -15));
        System.out.println(linearSearch(intArray, 1));
        System.out.println(linearSearch(intArray, 8888));
        System.out.println(linearSearch(intArray, -22));
    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value)
                return i;
        return -1;
    }
}
