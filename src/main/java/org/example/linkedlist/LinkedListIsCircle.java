package org.example.linkedlist;

public class LinkedListIsCircle {
	private static class Node { 
		public int data; 
		public Node next; 

		public Node(int data) { 
			this.data = data; 
			this.next = null; 
		} 
	} 

	private Node head; 

	public LinkedListIsCircle() {
		head = null; 
	} 

	public void addToFront(int data) { 
		Node newNode = new Node(data); 
		newNode.next = head; 
		head = newNode; 
	} 

	public boolean isCircular() { 
		if (head == null) { 
			return false; 
		} 
		Node slow = head; 
		Node fast = head.next; 
		while (fast != null && fast.next != null) { 
			if (slow == fast) { 
				return true; 
			} 
			slow = slow.next; 
			fast = fast.next.next; 
		} 
		return false; 
	} 



	public static void main(String[] args) { 
		LinkedListIsCircle list = new LinkedListIsCircle();
		list.addToFront(1); 
		list.addToFront(2); 
		list.addToFront(3); 
		list.addToFront(4); 
		System.out.println(list.isCircular()); // Output: false 
	} 
} 
