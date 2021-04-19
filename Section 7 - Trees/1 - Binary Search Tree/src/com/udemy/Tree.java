package com.udemy;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) // If the tree is empty, then the value will be at the root node
            root = new TreeNode(value);
        else
            root.insert(value);
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null)
            return subTreeRoot;

        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            if (subTreeRoot.getLeftChild() == null)
                return subTreeRoot.getRightChild();
            else if (subTreeRoot.getRightChild() == null)
                return subTreeRoot.getLeftChild();
            // Case 3: node to delete has 2 children /
            // Replace the value in the subTreeRoot node with smallest value from the right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            // Delete the node that has smallest value in the right subtree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }
        // Node to delete is a leaf node (has no children)
        return subTreeRoot;
    }

    public int max() {
        if (root == null)
            return Integer.MAX_VALUE;
        return root.max();
    }

    public int min() {
        if (root == null)
            return Integer.MIN_VALUE;
        return root.min();
    }

    public TreeNode get(int value) {
        if (root != null)
            return root.get(value);

        return null;
    }

    public void traverseInOrder() {
        if (root == null) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        root.traverseInOrder();
        System.out.println("\b\b]");
    }
}
