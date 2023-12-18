package org.example.binarytree;// Java program to see if two trees
// are mirror of each other



public class IsMirrorBinaryTree 
{
	Node a, b;
	
	/* Given two trees, return true if they are
	mirror of each other */
	boolean areMirror(Node a, Node b) 
	{
		/* Base case : Both empty */
		if (a == null && b == null)
			return true;

		// If only one is empty
		if (a == null || b == null) 
			return false;

		/* Both non-empty, compare them recursively
		Note that in recursive calls, we pass left
		of one tree and right of other tree */
		return a.data == b.data
				&& areMirror(a.left, b.right)
				&& areMirror(a.right, b.left);
	}

	// Driver code to test above methods
	public static void main(String[] args) 
	{
		IsMirrorBinaryTree tree = new IsMirrorBinaryTree();
		Node a = new Node(1);
		Node b = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);

		b.left = new Node(3);
		b.right = new Node(2);
		b.right.left = new Node(5);
		b.right.right = new Node(4);

		if (tree.areMirror(a, b))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}

// This code has been contributed by Mayank Jaiswal(mayank_24)
