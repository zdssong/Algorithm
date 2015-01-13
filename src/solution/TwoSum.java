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
	 * the first try,use the most simple solution fail because of time out
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

	/**
	 * The second try,sort the array first ,then find The two number;
	 * but will occur Time Limit Exceeded
	 * I don't understand
	 * */
	public int[] twoSum1(int[] numbers, int target) {
		int indexes[] = new int[2];
		quickSort(numbers, 0, numbers.length - 1);
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

	private void quickSort(int[] numbers, int l, int r) {
		int x = numbers[l];
		if (l < r) {
			int i = l;
			int j = r;
			while (i < j) {
				while (i < j && numbers[j] >= x)
					j--;
				if (i < j) {
					numbers[i++] = numbers[j];
				}
				while (i < j && numbers[i] <= x)
					i++;
				if (i < j) {
					numbers[j++] = numbers[i];
				}
			}
			numbers[i] = x;
			quickSort(numbers, l, i - 1);
			quickSort(numbers, i + 1, r);
		}
	}

	/**
	 * use the list to handle the array,to do the sort the array
	 * */
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
