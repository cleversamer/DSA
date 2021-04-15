package com.udemy;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue<E> {

    private E[] queue;
    private int front;
    private int back;

    public ArrayQueue() {
        this.queue = (E[]) new Object[1];
    }

    public ArrayQueue(int capacity) {
        this.queue = (E[]) new Object[capacity];
    }

    public void add(E item) {
        if (this.size() == this.queue.length - 1) {
            int numItems = this.size();
            E[] newArray = (E[]) new Object[2 * this.queue.length];

            System.arraycopy(this.queue, this.front, newArray, 0, this.queue.length - this.front);
            System.arraycopy(this.queue, 0, newArray, this.queue.length - this.front, this.back);

            this.queue = newArray;

            this.front = 0;
            this.back = numItems;
        }

        this.queue[this.back] = item;
        this.back = (this.back < this.queue.length - 1) ? ++this.back : 0;
    }

    public E remove() {
        if (this.size() == 0)
            throw new NoSuchElementException();

        E removedItem =this.queue[this.front];
        this.queue[this.front++] = null;

        if (this.size() == 0) {
            this.front = 0;
            this.back = 0;
        } else if (this.front == this.queue.length) {
            this.front = 0;
        }
        return removedItem;
    }

    public E peek() {
        if (this.size() == 0)
            throw new NoSuchElementException();

        return this.queue[this.front];
    }

    public int size() {
        return (front <= back) ? (back - front) : (back - front + queue.length);
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        if (this.size() == 0)
            return "[]";

        StringBuilder queue = new StringBuilder("[");
        for (E element : this.queue)
            if (element != null)
                queue.append(element).append(", ");
        return queue.append("\b\b]").toString();
    }
}
