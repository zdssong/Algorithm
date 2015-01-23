package algorithm;

import easy.MergeSortedArray;

public class Main {

	public static void main(String[] arg) {
		int A[] = new int[6];
		A[0] = 4;
		int B[] = new int[] { 1, 2, 3, 5, 6 };
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		mergeSortedArray.merge(A, 1, B, 5);
	}

	public static void change(int[] one) {
		one[0] = 3;
	}
}
