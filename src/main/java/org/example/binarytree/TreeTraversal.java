package org.example.binarytree;// Java program for different tree traversals

public class TreeTraversal {

    // Root of Binary Tree
    Node root;

    TreeTraversal() {
        root = null;
    }

    // Given a binary tree, print its nodes in inorder
    void printInorder(Node node) {
        if (node == null)
            return;

        // First recur on left child
        printInorder(node.left);

        // Then print the data of node
        System.out.print(node.key + " ");

        // Now recur on right child
        printInorder(node.right);
    }


    void printPreorder(Node node) {
        if (node == null)
            return;

        // First print data of node
        System.out.print(node.key + " ");

        // Then recur on left subtree
        printPreorder(node.left);

        // Now recur on right subtree
        printPreorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        // First recur on left subtree
        printPostorder(node.left);

        // Then recur on right subtree
        printPostorder(node.right);

        // Now deal with the node
        System.out.print(node.key + " ");
    }

    // Driver code
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function call
        System.out.println(
                "Inorder traversal of binary tree is ");
        //4 2 5 1 3
        tree.printInorder(tree.root);
    }
}
