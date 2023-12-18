package org.example.matrix;

public class RotateMatrix {
	public static void rotateMatrix(int[][] matrix)
	{
		int n = matrix.length;

		// transpose the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				swap(matrix, i, j, j, i);
			}
		}

		// reverse each column
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				swap(matrix, j, i, n - j - 1, i);
			}
		}
	}

	private static void swap(int[][] matrix, int i, int j,
							int k, int l)
	{
		int temp = matrix[i][j];
		matrix[i][j] = matrix[k][l];
		matrix[k][l] = temp;
	}
	// driver program
	public static void main(String[] args)
	{
		int[][] matrix
			= { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateMatrix(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
