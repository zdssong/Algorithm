package easy;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * click to show spoilers.
 * 
 * Some hints: Could negative integers be palindromes? (ie, -1)
 * 
 * If you are thinking of converting the integer to string, note the restriction
 * of using extra space.
 * 
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might overflow.
 * How would you handle such case?
 * 
 * There is a more generic way of solving this problem.
 * 
 * url:https://oj.leetcode.com/problems/palindrome-number/
 * */
public class PalindromeNumber {
	/**
	 * 11505 / 11505 test cases passed. Status: Accepted Runtime: 432 ms
	 * */
	public static boolean isPalindrome(int x) {
		if (x < 10 && x >= 0)
			return true;
		if (x < 0)
			return false;
		double result = 0;
		int tempX = x;
		int length = 0;
		while (tempX > 0) {
			if ((tempX = tempX / 10) >= 0)
				length++;
		}
		tempX = x;
		for (int i = 1; i <= length; i++) {
			int temp = tempX % 10;
			tempX = tempX / 10;
			result += temp * Math.pow(10, length - i);
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
				return false;
		}
		if (x == result)
			return true;
		else
			return false;
	}
}
