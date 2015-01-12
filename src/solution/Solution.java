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
	 * ����취��ͨ���������ķ�����ͬΪ�㣬��ͬΪһ�����������ԭ�������Ĺ���
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
