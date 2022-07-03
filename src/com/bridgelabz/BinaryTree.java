package com.bridgelabz;

public class BinaryTree<K extends Comparable<K>> {

    private Node<K> root;

    private Node<K> addRecursively(Node<K> current, K key) {

        if (current == null) {
            return new Node<K>(key);
        }

        int compareResult = key.compareTo(current.key);

        if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);

        return current;

    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private int getSizeRecursively(Node<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
    }

    public int getSize() {
        return this.getSizeRecursively(root);
    }
    public void printBinaryTree() {
        System.out.println("My Tree: " + root);
    }
    @Override
    public String toString() {
        return "MyBinaryTree{" + root + '}';
    }
}
