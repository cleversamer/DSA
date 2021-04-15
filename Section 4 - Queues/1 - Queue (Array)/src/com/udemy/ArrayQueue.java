package com.udemy;

import java.util.NoSuchElementException;

public class ArrayQueue<E> {

    private E[] queue;
    private int front;
    private int back;

    public ArrayQueue() {
        queue = (E[]) new Object[1];
    }

    public ArrayQueue(int capacity) {
        queue = (E[]) new Object[capacity];
    }

    public void add(E E) {
        if (back == queue.length) {
            E[] newArray = (E[]) new Object[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = E;
        back++;
    }

    public E remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        E removedItem = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return removedItem;
    }

    public E peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return "[]";

        StringBuilder queue = new StringBuilder("[");
        for (int i = this.front; i < this.back; i++)
            queue.append(this.queue[i]).append(", ");
        return queue.append("\b\b]").toString();
    }
}
