package easy;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211. Given an integer n, generate the nth
 * sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 * url:https://oj.leetcode.com/problems/count-and-say/
 * */
public class CountAndSay {

	/**
	 * this solution is copy from
	 * https://oj.leetcode.com/discuss/23018/accepted-java-solution,and I don't
	 * understand what the title mean,so I can't solve the problem
	 * */
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		String str = "1", result = "";
		int counter = 0, current = 0, prev = 0;
		char[] chars;
		for (int i = 2; i <= n; i++) {
			chars = str.toCharArray();
			result = "";
			counter = 0;
			current = 0;
			prev = 0;
			for (int j = 0; j < chars.length; j++) {
				current = (int) (chars[j] - '0');
				if (current == prev) {
					counter++;
				} else if (current != prev && counter != 0) {
					result += counter + "" + prev;
					prev = current;
					counter = 1;
				} else {
					prev = current;
					counter++;
				}
			}
			result += counter + "" + current;
			str = result;
		}
		return str;
	}

	public static String myCountAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		String str = "";
		String result = "1";
		char nextChar = ' ', currentChar = ' ';
		for (int i = 1; i < n; i++) {
			int count = 1;
			int length = result.length();
			for (int j = 0; j < length; j++) {
				currentChar = result.charAt(j);
				if (j==length-1) {
					break;
				}
				nextChar = result.charAt(j + 1);
				if (currentChar == nextChar) {
					count++;
				} else {
					str += count + "" + (currentChar - '0');
					count = 1;
				}
			}
			str += count + "" + (currentChar - '0');
			result = str;
			str="";
		}
		return result;
	}
}
