package solution;

public class Solution {

	/**
	 * Given an array of integers, every element appears twice except for one.
	 * Find that single one.
	 * 
	 * Note:
	 * Your algorithm should have a linear runtime complexity. Could you
	 * implement it without using extra memory?
	 * 
	 * @param A is an array of integers,every element appears twice except for one.
	 * @return the single integer
	 * @
	 * 解决办法是通过异或运算的法则，相同为零，不同为一；与零异或是原来的数的规律
	 * */
	public int singleNumber(int[] A) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int result = A[0];

		for (int i = 1; i < A.length; i++) {
			result = result ^ A[i];
		}
		return result;
	}
}
