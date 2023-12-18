package org.example.binarytree;

import java.util.Stack;

class IsMirrorTree2 {
    static boolean isMirrorIterative(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root1);
        s2.push(root2);

        while (!s1.empty() && !s2.empty()) {
            Node curr1 = s1.pop();
            Node curr2 = s2.pop();

            if (curr1.data != curr2.data)
                return false;

            if (curr1.left != null && curr2.right != null) {
                s1.push(curr1.left);
                s2.push(curr2.right);
            } else if (curr1.left != null || curr2.right != null)
                return false;

            if (curr1.right != null && curr2.left != null) {
                s1.push(curr1.right);
                s2.push(curr2.left);
            } else if (curr1.right != null || curr2.left != null)
                return false;
        }

        if (!s1.empty() || !s2.empty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        // create the two trees
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);

        // check if the two trees are mirrors
        if (isMirrorIterative(root1, root2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}