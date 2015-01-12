package solution;

/**
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * @param A
 *            is an array of integers,every element appears twice except for
 *            one.
 * @return the single integer
 * */
public class SingleNumber {

	/**
	 * 该算法的时间复杂度为线性的〇(n)，空间复杂度为〇(1) 解决办法是使用异或的方法
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

	public int singleNumber1(int[] A) {
		return A[0];
	}
}
