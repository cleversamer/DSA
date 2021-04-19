package com.udemy;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public int max() {
        if (rightChild == null)
            return data;
        return rightChild.max();
    }

    public int min() {
        if (leftChild == null)
            return data;
        return leftChild.min();
    }

    public TreeNode get(int value) {
        if (value == data)
            return this;

        if (value < data) {
            if (leftChild != null)
                return leftChild.get(value);
        } else {
            if (rightChild != null)
                return rightChild.get(value);
        }
        return null;
    }

    public void insert(int value) {
        if (value == data) // To avoid duplicate values
            return;

        if (value < data)
            if (leftChild == null)
                leftChild = new TreeNode(value);
            else
                leftChild.insert(value);
        else if (rightChild == null)
            rightChild = new TreeNode(value);
        else
            rightChild.insert(value);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void traverseInOrder() {
        if (leftChild != null)
            leftChild.traverseInOrder();

        System.out.print(data + ", ");

        if (rightChild != null)
            rightChild.traverseInOrder();
    }

    @Override
    public String toString() {
        return "Data = " + data;
    }
}
