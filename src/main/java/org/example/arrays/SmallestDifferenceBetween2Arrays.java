package org.example.arrays;// Java Code to find Smallest
// Difference between two Arrays
import java.util.*;

class SmallestDifferenceBetween2Arrays
{
	
	// function to calculate Small 
	// result between two arrays
	static int findSmallestDifference(int A[], int B[],
									int m, int n)
	{
		// Sort both arrays 
		// using sort function
		Arrays.sort(A);
		Arrays.sort(B);
	
		int a = 0, b = 0;
	
		// Initialize result as max value
		int result = Integer.MAX_VALUE;
	
		// Scan Both Arrays upto 
		// sizeof of the Arrays
		while (a < m && b < n)
		{
			if (Math.abs(A[a] - B[b]) < result)
				result = Math.abs(A[a] - B[b]);
	
			// Move Smaller Value
			if (A[a] < B[b])
				a++;
	
			else
				b++;
		}
		
		// return final sma result
		return result; 
	}
	
	// Driver Code
	public static void main(String[] args) 
	{
		// Input given array A
		int A[] = {1, 2, 11, 5};
	
		// Input given array B
		int B[] = {4, 12, 19, 23, 127, 235};
	
	
		// Calculate size of Both arrays
		int m = A.length;
		int n = B.length;
	
		// Call function to 
		// print smallest result
		System.out.println(findSmallestDifference
								(A, B, m, n));
		
	}
}
// This code is contributed
// by Arnav Kr. Mandal.
