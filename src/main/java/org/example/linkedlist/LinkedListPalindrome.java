package org.example.linkedlist;/* Java program to check if linked list is palindrome
* recursively */
import java.util.*;

public class LinkedListPalindrome {

	public static void main(String args[])
	{
		MyNode one = new MyNode(1);
		MyNode two = new MyNode(2);
		MyNode three = new MyNode(3);
		MyNode four = new MyNode(4);
		MyNode five = new MyNode(3);
		MyNode six = new MyNode(2);
		MyNode seven = new MyNode(1);
		one.ptr = two;
		two.ptr = three;
		three.ptr = four;
		four.ptr = five;
		five.ptr = six;
		six.ptr = seven;
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}
	static boolean isPalindrome(MyNode head)
	{

		MyNode slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.ptr;
		}

		while (head != null) {

			int i = stack.pop();
			if (head.data == i) {
				ispalin = true;
			}
			else {
				ispalin = false;
				break;
			}
			head = head.ptr;
		}
		return ispalin;
	}


}
class MyNode {
	public int data;
	public MyNode ptr;
	MyNode(int d)
	{
		ptr = null;
		data = d;
	}
}

