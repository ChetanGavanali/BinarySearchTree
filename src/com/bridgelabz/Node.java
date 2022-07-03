package com.bridgelabz;

public class Node <K extends Comparable<K>> {

    K key;
    Node<K> left;
    Node<K> right;

    public Node(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        StringBuilder myNodeString = new StringBuilder();
        myNodeString.append("{"+"Key = ").append(key).append('}');

        if(left != null) {
            myNodeString.append("->").append(left);
        }
        if(right != null) {
            myNodeString.append("->").append(right);
        }
        return myNodeString.toString();
    }
}
