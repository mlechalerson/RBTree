
        package com.company;
import java.util.*;
public class RBTreeVisualization {
    public static void main(String[] args) {
        RBTree tree = new RBTree();
        tree.insert(10, 10);
        tree.insert(5, 5);
        tree.insert(15, 15);
        tree.insert(3, 3);
        tree.insert(7, 7);
        tree.insert(12, 12);
        tree.insert(18, 18);
        visualizeTree(tree.root);
    }
    private static void visualizeTree(Node root) {
        Map<Node, Integer> nodePositions = new HashMap<>();
        calculateNodePositions(root, nodePositions, 0, 0);
        printTree(root, nodePositions, 0);
    }
    private static void calculateNodePositions(Node node, Map<Node, Integer> positions, int level, int position) {
        if (node != null) {
            calculateNodePositions(node.left, positions, level + 1, position - 1);
            positions.put(node, position);
            calculateNodePositions(node.right, positions, level + 1, position + 1);
        }
    }
    private static void printTree(Node node, Map<Node, Integer> positions, int level) {
        if (node != null) {
            printTree(node.right, positions, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(node.key + "(" + (node.isRed ? "R" : "B") + ")");
            printTree(node.left, positions, level + 1);
        }
    }
}
