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

    public void add(E item) {
        if (back == queue.length) {
            E[] newArray = (E[]) new Object[2 * this.queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back++] = item;
    }

    public void remove() {
        if (this.isEmpty())
            throw new NoSuchElementException();

        queue[front++] = null;
        if (this.size() == 0){
            front = 0;
            back = 0;
        }
    }

    public E peek() {
        if (this.isEmpty())
            throw new NoSuchElementException();
        return this.queue[this.front];
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return this.back - this.front;
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
