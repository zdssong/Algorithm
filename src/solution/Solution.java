package solution;

/**
 * this class include the singleNumber solution，TwoSum solution
 * */
public class Solution {

	/**
	 * <b>问题描述</b> Given an array of integers, every element appears twice
	 * except for one. Find that single one.
	 * 
	 * Note: Your algorithm should have a linear runtime complexity. Could you
	 * implement it without using extra memory?
	 * 
	 * @param A
	 *            is an array of integers,every element appears twice except for
	 *            one.
	 * @return the single integer
	 * @category 解决办法是通过异或运算的法则，相同为零，不同为一；与零异或是原来的数的规律
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

	/**
	 * <b>问题描述</b> Given an array of integers, find two numbers such that they
	 * add up to a specific target number.
	 * 
	 * Note: Your algorithm should have a linear runtime complexity. Could you
	 * implement it without using extra memory?
	 * 
	 * @param numbers
	 *            is an array of integers
	 * @param target
	 *            is the target number
	 * @return two indexes of number which sum equal to the target
	 * 
	 * */
	public int[] twoSum(int[] numbers, int target) {
		int index[] = new int[2];
		int temp1, temp2;
		for (int i = 0; i < numbers.length; i++) {
			temp1 = numbers[i];
			for (int j = i + 1; j < numbers.length; j++) {
				temp2 = numbers[j];
				if ((temp1 + temp2) == target) {
					index[0] = i + 1;
					index[1] = j + 1;
					return index;
				}
			}
		}
		return index;
	}
}
