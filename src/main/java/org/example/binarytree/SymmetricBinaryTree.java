package org.example.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricBinaryTree {
    //Function to implement the iterative approach using a queue
    public static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(root);

        while (!q.isEmpty()) {
            Node leftNode = q.poll();
            Node rightNode = q.poll();

            // If both leftNode and rightNode are null, continue
            // to the next iteration
            if (leftNode == null && rightNode == null) {
                continue;
            }

            // If either leftNode or rightNode is null or their
            // data is not equal, return false
            if (leftNode == null || rightNode == null || leftNode.data != rightNode.data) {
                return false;
            }

            // Pushing the left and right nodes of the current
            // node into the queue
            q.add(leftNode.left);
            q.add(rightNode.right);
            q.add(leftNode.right);
            q.add(rightNode.left);
        }
        return true;
    }

    //Driver Code
    public static void main(String[] args) {
        // Creating a binary tree
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(2);
        root.right.right = new Node(2);

        // Checking if the binary tree is symmetric or not
        if (isSymmetric(root)) {
            System.out.println("The binary tree is symmetric");
        } else {
            System.out.println("The binary tree is not symmetric");
        }
    }
}