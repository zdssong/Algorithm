package easy;

/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321 Example2: x = -123, return -321
 * 
 * click to show spoilers.
 * 
 * Have you thought about this? Here are some good questions to ask before
 * coding. Bonus points for you if you have already thought through this!
 * 
 * If the integer's last digit is 0, what should the output be? ie, cases such
 * as 10, 100.
 * 
 * Did you notice that the reversed integer might overflow? Assume the input is
 * a 32-bit integer, then the reverse of 1000000003 overflows. How should you
 * handle such cases?
 * 
 * For the purpose of this problem, assume that your function returns 0 when the
 * reversed integer overflows.
 * 
 * Update (2014-11-10): Test cases had been added to test the overflow behavior.
 * 
 * url:https://oj.leetcode.com/problems/reverse-integer/
 * */
public class ReverseInteger {
	/**
	 * 1032 / 1032 test cases passed. Status: Accepted Runtime: 239 ms
	 * */
	public static int reverse(int x) {
		if (x == 0) {
			return x;
		}
		double result = 0;
		int tempX = 0;
		if (x < 0) {
			tempX = -x;
		} else {
			tempX = x;
		}
		int length = 0;
		while (tempX > 0) {
			if ((tempX = tempX / 10) >= 0)
				length++;
		}
		for (int i = 1; i <= length; i++) {
			int temp = x % 10;
			x = x / 10;
			result += temp * Math.pow(10, length - i);
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
				return 0;
		}
		return (int) result;
	}
}
