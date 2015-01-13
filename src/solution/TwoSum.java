package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>问题描述</b> Given an array of integers, find two numbers such that they add
 * up to a specific target number.
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
public class TwoSum {
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
		int indexes[] = new int[2];
		List<Integer> list = new ArrayList<>();
		list.add(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			if (list.contains(target - numbers[i])) {
				indexes[1] = i + 1;
				indexes[0] = list.indexOf(target - numbers[i]) + 1;
			}
		}
		return indexes;
	}

	public int[] twoSum1(int[] numbers, int target) {
		int l = 0, r = numbers.length - 1;
		int indexes[] = new int[2];
		int x = numbers[0];
		while (l < r) {
			while (l < r && numbers[r] >= x)
				r--;
			if (l < r) {
				numbers[l] = numbers[r];
				x = numbers[r];
			}
			while (l < r && numbers[l] <= x)
				l++;
			if (l < r) {
				numbers[r] = numbers[l];
				x = numbers[l];
			}
		}
		numbers[l] = x;
		for (int i = 0, j = numbers.length - 1; i < j;) {
			if (numbers[i] + numbers[j] > target) {
				j--;
				continue;
			}
			if (numbers[i] + numbers[j] < target) {
				i++;
				continue;
			}
			if (numbers[i] + numbers[j] == target) {
				indexes[0] = i + 1;
				indexes[1] = j + 1;
			}
		}
		return indexes;
	}

	public int[] twoSum2(int[] numbers, int target) {
		int indexes[] = new int[2];
		List<Integer> list = new ArrayList<>();
		list.add(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			if (list.contains(target - numbers[i])) {
				indexes[1] = i + 1;
				indexes[0] = list.indexOf(target - numbers[i]) + 1;
				break;
			} else {
				list.add(numbers[i]);
			}
		}
		return indexes;
	}
}
