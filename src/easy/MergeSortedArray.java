package easy;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Note: You may assume that A has enough space (size that is greater or equal
 * to m + n) to hold additional elements from B. The number of elements
 * initialized in A and B are m and n respectively.
 * 
 * url:https://oj.leetcode.com/problems/merge-sorted-array/
 * 
 * @author zds_song
 * */
public class MergeSortedArray {

	public void merge(int A[], int m, int B[], int n) {
		// when A contain nothing,clone B to A and return
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				A[i] = B[i];
			}
			return;
		}
		// when B contain nothing,return
		if (n == 0)
			return;
		int ASize = m;
		for (int i = 0, j = 0; j < n;) {
			if (A[i] < B[j]) {
				i++;
				// when reach the end of A,Then Put B to end of A and return
				if (i == ASize) {
					for (int k = j; k < n; k++) {
						A[i] = B[k];
						i++;
					}
					return;
				}
				continue;
			} else {
				// insert B[j] into A
				for (int k = ASize; k > i; k--) {
					A[k] = A[k - 1];
				}
				ASize++;
				A[i] = B[j];
				i++;
				j++;
			}
		}
	}
}
