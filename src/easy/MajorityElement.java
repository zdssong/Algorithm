package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than [n/2] times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * url:https://oj.leetcode.com/problems/majority-element/
 * */

public class MajorityElement {
	public static final String TAG = "MajorityElement: ";

	/**
	 * pass the test in the third time by used 300ms
	 * */
	public static int majorityElement(int[] num) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int remainder = num.length % 2;
		int count = 1;
		int pre = 0;
		pre = num[0];
		for (int i = 1; i < num.length; i++) {
			if (pre == num[i]) {
				count++;
			} else {
				if (map.containsKey(pre)) {
					count += map.get(pre);
				}
				if (count >= (num.length / 2 + remainder)) {
					return pre;
				}
				map.put(pre, count);
				pre = num[i];
				count = 1;
			}
		}
		return num[num.length - 1];
	}
}
