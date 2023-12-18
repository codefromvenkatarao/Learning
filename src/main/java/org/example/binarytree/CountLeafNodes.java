package org.example.binarytree;// Java implementation to find leaf count of a given Binary tree

/* Class containing left and right child of current 
node and key value*/

public class CountLeafNodes 
{
	//Root of the Binary Tree
	Node root;
	
	/* Function to get the count of leaf nodes in a binary tree*/
	int getLeafCount() 
	{
		return getLeafCount(root);
	}

	int getLeafCount(Node node) 
	{
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			return getLeafCount(node.left) + getLeafCount(node.right);
	}

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{
		/* create a tree */
		CountLeafNodes tree = new CountLeafNodes();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		/* get leaf count of the above tree */
		System.out.println("The leaf count of binary tree is : "
							+ tree.getLeafCount());
	}
}

// This code has been contributed by Mayank Jaiswal(mayank_24)