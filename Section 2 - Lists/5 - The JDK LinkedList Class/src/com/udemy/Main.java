package com.udemy;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        printList(list);

        list.addLast(5);
        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);
    }

    private static void printList(List<?> list) {
        if (list.isEmpty()) {
            System.out.println("{}");
            return;
        }
        System.out.print("{");
        for (Object temp : list)
            System.out.print(temp + ", ");
        System.out.println("\b\b}");
    }
}
