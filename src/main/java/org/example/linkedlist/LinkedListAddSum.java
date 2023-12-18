package org.example.linkedlist;// Java program to add two numbers represented by Linked
// Lists by reversing lists

class LinkedListAddSum {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	// function to reverse the linked list and return the
	// head of the reversed list
	static Node reverseList(Node list)
	{
		Node prev = null, curr = list, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	// function that calculates and prints the sum of two
	// numbers represented
	// by linked lists

	static void addTwoLists(Node first, Node second)
	{
		// code here
		first = reverseList(first);
		second = reverseList(second);

		int carry = 0;
		Node head = null, prev = null;
		Node sum = null;

		while (first != null || second != null
			|| carry
					== 1) // if any one of these is left
							// we are stil left with addition
		{
			int newVal = carry;

			if (first != null)
				newVal += first.data;
			if (second != null)
				newVal += second.data;

			carry = newVal / 10; // to be used in the next
								// node calculation
			newVal = newVal % 10;

			Node newNode = new Node(newVal);
			newNode.next
				= sum; // appending in the beginning of the
					// final ans list, this way we do not
					// have to reverse in the end
			sum = newNode;

			if (first != null) // initialising nodes for
							// next iteration
				first = first.next;
			if (second != null)
				second = second.next;
		}

		printList(sum);
	}

	/* Utility function to print a linked list */
	static void printList(Node head)
	{
		while (head.next != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println(head.data);
	}

	// Driver Code
	public static void main(String[] args)
	{
		LinkedListAddSum list = new LinkedListAddSum();

		// creating first list
		list.head1 = new Node(7);
		list.head1.next = new Node(5);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(6);

		// creating second list
		list.head2 = new Node(8);
		list.head2.next = new Node(4);

		System.out.print("Sum List : ");
		// add the two lists and see the result
		list.addTwoLists(head1, head2);
	}

	// this code is contributed by Abhijeet
	// Kumar(abhijeet19403)
}
