package org.example.binarytree;

// Java program to count total number of
// non-leaf nodes in a binary tree 
class CountNonLeafNodes {

    /* A binary tree node has data, pointer to
    left child and a pointer to right child */
/* Helper function that allocates a new node with the 
given data and NULL left and right pointers. */
    static Node newNode(int data) {
        Node node = new Node(data);
        node.data = data;
        node.left = null;
        node.right = null;
        return (node);
    }

    /* Computes the number of non-leaf nodes in a tree. */
    static int countNonleaf(Node root) {
        // Base cases.
        if (root == null || (root.left == null &&
                root.right == null))
            return 0;

        // If root is Not NULL and its one of its
        // child is also not NULL
        return 1 + countNonleaf(root.left) +
                countNonleaf(root.right);
    }

    /* Driver program to test size function*/
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        System.out.println(countNonleaf(root));
    }
} 
