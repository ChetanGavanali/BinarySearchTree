package com.bridgelabz;

public class BinaryTreeMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure Binary Search Tree");

        BinaryTree<Integer> myBinaryTree = new BinaryTree<Integer>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        myBinaryTree.printBinaryTree();

    }
}
