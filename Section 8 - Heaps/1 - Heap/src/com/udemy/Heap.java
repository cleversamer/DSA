package com.udemy;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        this.heap = new int[capacity];
    }

    public int delete(int index) {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap is empty");

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent])
            fixHeapBelow(index, size - 1);
        else
            fixHeapAbove(index);

        --size;
        return deletedValue;
    }

    public void insert(int value) {
        if (isFull())
            throw new IndexOutOfBoundsException("Heap is full");

        heap[size] = value;
        fixHeapAbove(size++);
    }

    public int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Heap is empty");

        return heap[0];
    }

    private void fixHeapAbove(int index) {
        int value = heap[index];
        int parent = heap[getParent(index)];
        while (index > 0 && value > parent) {
            heap[index] = parent;
            index = getParent(index);
        }
        heap[index] = value;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;
        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex)
                    childToSwap = leftChild;
                else
                    childToSwap = (heap[leftChild] > heap[rightChild]) ? leftChild : rightChild;

                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    public int getParent(int index) {
        // We don't have to use Math.floor() method because we're dealing with int
        // and the result will be automatically rounded down.
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";

        StringBuilder heapString = new StringBuilder("[");
        for (int i = 0; i < size; i++)
            heapString.append(heap[i]).append(", ");

        return heapString.append("\b\b]").toString();
    }
}
