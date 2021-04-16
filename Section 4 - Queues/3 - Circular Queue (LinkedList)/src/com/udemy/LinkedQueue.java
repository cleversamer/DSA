package com.udemy;

import java.util.LinkedList;

public class LinkedQueue<E> {

    private final LinkedList<E> queue;

    public LinkedQueue() {
        this.queue = new LinkedList<>();
    }

    public boolean add(E e) {
        return this.queue.add(e);
    }

    public E remove() {
        return this.queue.removeFirst();
    }

    public E peek() {
        return this.queue.getFirst();
    }

    public int size() {
        return this.queue.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        return this.queue.toString();
    }
}
