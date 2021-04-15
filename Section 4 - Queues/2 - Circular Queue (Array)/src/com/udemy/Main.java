package com.udemy;

public class Main {

    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<>();

        System.out.println("Queue = " + queue);
        System.out.println("isEmpty = " + queue.isEmpty());

        queue.add(1);
        queue.add(2);
        queue.remove();

        queue.add(1);
        queue.remove();

        queue.add(1);
        queue.remove();

        queue.add(1);
        queue.remove();

        queue.add(1);
        queue.remove();

        queue.add(2);
        System.out.println("Queue = " + queue);
        System.out.println("Size = " + queue.size());

        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Queue = " + queue);
        System.out.println("Size = " + queue.size());

        System.out.println("First element = " + queue.peek());

        queue.remove();
        System.out.println("Queue after remove = " + queue);
    }
}
