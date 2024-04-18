
        package com.company;
public class Node {
    int key;
    int value;
    Node parent;
    Node left;
    Node right;
    boolean isRed;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.isRed = true;
    }
}
