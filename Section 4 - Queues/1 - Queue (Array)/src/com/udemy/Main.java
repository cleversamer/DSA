package com.udemy;

public class Main {

    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<>();

        System.out.println("isEmpty = " + queue.isEmpty());
        System.out.println("Queue = " + queue);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue = " + queue);
        System.out.println("Length = " + queue.size());

        queue.remove();
        System.out.println("Queue = " + queue);
        System.out.println("Length = " + queue.size());

        System.out.println("First element = " + queue.peek());
    }
}
